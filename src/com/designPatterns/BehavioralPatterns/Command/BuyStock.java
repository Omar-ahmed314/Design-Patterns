package com.designPatterns.BehavioralPatterns.Command;

public class BuyStock implements IOrder{
    private Stock stock;

    BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
