package com.designPatterns.StructuralPatterns.AdapterPattern;

public class AdvancedMediaPlayerAdapter extends AudioPlayer{
    private VlcPlayer vlcPlayer;
    private mp4Player mp4Player;

    AdvancedMediaPlayerAdapter(VlcPlayer p1, mp4Player p2) {
        this.mp4Player = p2;
        this.vlcPlayer = p1;
    }

    @Override
    public void play(String fileName) throws Exception{
        String audioExtension = getFormat(fileName);
        switch (audioExtension) {
            case "mp3":
                super.play(fileName);
                break;
            case "mp4":
                this.mp4Player.loadFileName(fileName);
                this.mp4Player.listen();
                break;
            case "vlc":
                this.vlcPlayer.loadFileName(fileName);
                this.vlcPlayer.listen();
                break;
            default:
                System.out.println("Unsupported format");
        }
    }

    private String getFormat(String fileName) {
        int extensionStartIndex = fileName.indexOf('.');
        return fileName.substring(extensionStartIndex + 1);
    }
}
