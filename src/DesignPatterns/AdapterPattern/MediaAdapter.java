package DesignPatterns.AdapterPattern;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        } else if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4File(fileName);
        } else if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVLCFile(fileName);
        }
    }
}
