package helloworld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
  @Test
  public void successfulResponse() {
    App app = new App();
    infRequete result = app.handleRequest(new infRequete(3.0, "EUR,USD"), null);
    //String content = result;
    //System.out.println(content);
    assertTrue(result.getBitcoinAmount()== 3.0);
    //assertTrue(content.contains("\"USD\""));
    //assertTrue(content.contains("\"bitcoinAmount\""));
  }
}
