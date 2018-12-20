package helloworld;

import java.util.List;

public class infRequete {
    private double bitcoinAmount;
    private String currencyList;
    private coursBitcoin currenciesEquivalent;

    public infRequete(){

    }

    public infRequete(double quota, String liste){
        this.bitcoinAmount = quota;
        this.currencyList = liste;
    }

    public infRequete(double quota, coursBitcoin valeurBitcoin){
        this.bitcoinAmount = quota;
        this.currenciesEquivalent = valeurBitcoin;
    }


    public String getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(String currencyList) {
        this.currencyList = currencyList;
    }

    public infRequete(final String body) {

    }

    public double getBitcoinAmount() {
        return bitcoinAmount;
    }

    public void setBitcoinAmount(double bitcoinAmount) {
        this.bitcoinAmount = bitcoinAmount;
    }

    public coursBitcoin getCurrenciesEquivalent() {
        return currenciesEquivalent;
    }

    public void setCurrenciesEquivalent(coursBitcoin currenciesEquivalent) {
        this.currenciesEquivalent = currenciesEquivalent;
    }
}
