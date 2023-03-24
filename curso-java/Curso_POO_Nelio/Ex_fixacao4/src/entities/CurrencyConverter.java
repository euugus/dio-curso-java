package entities;

public class CurrencyConverter {

    public double priceDollar;
    public double priceReal;

    public double calc (){
        return priceDollar * priceReal * 1.06;
    }

}
