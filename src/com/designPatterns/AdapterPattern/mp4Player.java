package com.designPatterns.AdapterPattern;

public class mp4Player implements AdvancedMediaPlayer{
    private String fileName;

    @Override
    public void loadFileName(String fileName) throws Exception {
        this.fileName = fileName;
        if(!isCorrectFormat(fileName))
            throw new Exception("incorrect format");
    }

    @Override
    public void listen() {
        System.out.println("Playing " + this.fileName);
    }

    @Override
    public boolean isCorrectFormat(String fileName) {
        return fileName.toLowerCase().endsWith(".mp4");
    }
}
