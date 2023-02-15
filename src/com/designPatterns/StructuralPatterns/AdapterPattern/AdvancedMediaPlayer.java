package com.designPatterns.StructuralPatterns.AdapterPattern;

public interface AdvancedMediaPlayer {
    void loadFileName(String fileName) throws Exception;
    void listen();
    boolean isCorrectFormat(String fileName);
}
