package com.designPatterns.AdapterPattern;

public interface AdvancedMediaPlayer {
    void loadFileName(String fileName) throws Exception;
    void listen();
    boolean isCorrectFormat(String fileName);
}
