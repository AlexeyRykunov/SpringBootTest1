package com.example.springboottest1;

public class ExchangeRatesResponse {

    private long amount;
    private double rate;

    public ExchangeRatesResponse(long amount, double rate) {
        this.amount = amount;
        this.rate = rate;
    }

    public long getAmount() {
        return amount;
    }

    public double getRate () {
        return rate;
    }

}
