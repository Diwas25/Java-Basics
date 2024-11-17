package DesignPatterns.AdapterPattern;

public interface AdvancedMediaPlayer {
    void playMp4File(String fileName);
    void playVLCFile(String fileName);
}

class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playMp4File(String fileName) {
        System.out.println("Playing MP4 file: "+fileName);
    }

    @Override
    public void playVLCFile(String fileName) {
        //do nothing
    }
}

class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playMp4File(String fileName) {
        //do nothing
    }

    @Override
    public void playVLCFile(String fileName) {
        System.out.println("Playing VLC file: "+fileName);
    }
}


