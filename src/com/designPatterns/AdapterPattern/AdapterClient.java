package com.designPatterns.AdapterPattern;

public class AdapterClient {
    public static void main(String[] args) {
        // the code of the pattern will be written here
        // main code


        try {
            // media player
            System.out.println("Old Media Player");
            MediaPlayer mp3Player = new AudioPlayer();
            mp3Player.play("blinding lights.mp3");

            // advanced vlc media player
            System.out.println("\nAdvanced Media Player");
            AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
            vlcPlayer.loadFileName("facebook.vlc");
            vlcPlayer.listen();

            // mp4 player
            AdvancedMediaPlayer mp4Player = new mp4Player();
            mp4Player.loadFileName("how to be a rich man.mp4");
            mp4Player.listen();

            // new media player adapter
            System.out.println("\nMedia adapter player");
            MediaPlayer newPlayer = new AdvancedMediaPlayerAdapter((VlcPlayer) vlcPlayer, (mp4Player) mp4Player);
            newPlayer.play("facebook video.vlc");
            newPlayer.play("new video.mp4");
            newPlayer.play("audio.mp3");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
