package helloworld;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;

/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<infRequete, Object> {

    public String handleRequest(final infRequete input, final Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Custom-Header", "application/json");
        try {
            final String pageContents = this.getPageContents("https://min-api.cryptocompare.com/data/price?fsym=BTC&tsyms=EUR,USD,GBP,JPY,AUD");

            coursBitcoin courActu = new coursBitcoin(pageContents);
            //coursBitcoin courForUser = new coursBitcoin(monnaieToConvert,nbBitcoin,courActu);
            coursBitcoin courForUser = new coursBitcoin(input.getCurrencyList(),input.getBitcoinAmount(),courActu);
            infRequete repForUser = new infRequete(input.getBitcoinAmount(),courForUser);

            Gson gson = new Gson();
            String json = gson.toJson(repForUser);
            System.out.println(json);
            return json;
        } catch (IOException e) {
            return "{}";
        }
    }

    private String getPageContents(String address) throws IOException{
        BufferedReader br = null;
        StringJoiner lines = new StringJoiner(System.lineSeparator());
        try {
            URL url = new URL(address);
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return lines.toString();
    }
}
