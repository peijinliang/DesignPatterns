package com.design.patterns.adapter;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/
public class VLcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.Name" + fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }
}
