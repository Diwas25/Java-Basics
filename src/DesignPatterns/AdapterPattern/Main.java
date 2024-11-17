package DesignPatterns.AdapterPattern;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","Shiv Mahima.mp3");
        audioPlayer.play("mp4","Shiv Bhajan.mp4");
        audioPlayer.play("vlc","Shiv Strotam.vlc");
        audioPlayer.play("avi","Shiv Dhun.avi");
    }
}
