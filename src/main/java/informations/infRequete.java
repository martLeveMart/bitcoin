package informations;

public class infRequete {
    private double bitcoinAmount;
    private String currencyList;
    private coursBitcoin currenciesEquivalent;

    public double getBitcoinAmount() {
        return bitcoinAmount;
    }

    public void setBitcoinAmount(double bitcoinAmount) {
        this.bitcoinAmount = bitcoinAmount;
    }

    public String getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(String currencyList) {
        this.currencyList = currencyList;
    }

    public coursBitcoin getCurrenciesEquivalent() {
        return currenciesEquivalent;
    }

    public void setCurrenciesEquivalent(coursBitcoin currenciesEquivalent) {
        this.currenciesEquivalent = currenciesEquivalent;
    }
}
