package com.designPatterns.StructuralPatterns.BridgePattern;

public interface IColor {
    String fillWithColor();
}

class RedColor implements IColor {
    @Override
    public String fillWithColor() {
        return "Red";
    }
}

class GreenColor implements IColor {
    @Override
    public String fillWithColor() {
        return "Green";
    }
}