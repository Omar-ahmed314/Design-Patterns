package com.designPatterns.StructuralPatterns.AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer{
    private String fileName;

    @Override
    public void loadFileName(String fileName) throws Exception {
        this.fileName = fileName;
        if(!isCorrectFormat(fileName))
            throw new Exception("Incorrect Format");
    }

    @Override
    public void listen() {
        System.out.println("Playing " + this.fileName);
    }

    @Override
    public boolean isCorrectFormat(String fileName) {
        return fileName.toLowerCase().endsWith(".vlc");
    }
}
