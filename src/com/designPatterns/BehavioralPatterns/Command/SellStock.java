package com.designPatterns.BehavioralPatterns.Command;

public class SellStock implements IOrder{
    private Stock stock;

    SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.sell();
    }
}
