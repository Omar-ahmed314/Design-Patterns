package com.designPatterns.StructuralPatterns.AdapterPattern;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String fileName) throws Exception{
        if(isCorrectFormat(fileName)) {
            System.out.println("Playing audio " + fileName);
        } else {
            throw new Exception("unsupported file format");
        }
    }

    private boolean isCorrectFormat(String fileName) {
        return fileName.toLowerCase().endsWith("mp3");
    }
}
