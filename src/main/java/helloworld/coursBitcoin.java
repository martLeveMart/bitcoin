package helloworld;

import java.util.List;

public class coursBitcoin {
    private Double EUR;
    private Double USD;
    private Double GBP;
    private Double JPY;
    private Double AUD;

    public coursBitcoin(){

    }

    public coursBitcoin(final String body) {
        String body2 = body.split("}")[0];
        String[] tab = body2.split(",");
        for (int i = 0; i < tab.length; i++){
            Double val = Double.parseDouble(tab[i].split(":")[1]);
            switch (i){
                case 0:
                    this.EUR = val;
                    break;
                case 1:
                    this.USD = val;
                    break;
                case 2:
                    this.GBP = val;
                    break;
                case 3:
                    this.JPY = val;
                    break;
                case 4:
                    this.AUD = val;
                    break;
            }
        }
        System.out.println(this.getGBP());
    }

    public coursBitcoin(final String body, final Double quota, coursBitcoin coursActuel) {
        if(body.contains("EUR")){
            this.EUR = quota * coursActuel.getEUR();
        }
        if(body.contains("USD")){
            this.USD = quota * coursActuel.getUSD();
        }
        if(body.contains("GBP")){
            this.GBP = quota * coursActuel.getGBP();
        }
        if(body.contains("JPY")){
            this.JPY = quota * coursActuel.getJPY();
        }
        if(body.contains("AUD")){
            this.AUD = quota * coursActuel.getAUD();
        }
        System.out.println(this.getGBP());
    }

    public Double getEUR() {
        return EUR;
    }

    public void setEUR(Double EUR) {
        this.EUR = EUR;
    }

    public Double getUSD() {
        return USD;
    }

    public void setUSD(Double USD) {
        this.USD = USD;
    }

    public Double getGBP() {
        return GBP;
    }

    public void setGBP(Double GBP) {
        this.GBP = GBP;
    }

    public Double getJPY() {
        return JPY;
    }

    public void setJPY(Double JPY) {
        this.JPY = JPY;
    }

    public Double getAUD() {
        return AUD;
    }

    public void setAUD(Double AUD) {
        this.AUD = AUD;
    }
}
