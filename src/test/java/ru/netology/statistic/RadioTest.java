package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    void setQuanityChannel(){
        Radio radio = new Radio(10);
        int actual = radio.getChannelQuantity();
        int expected = 10;
        Assertions.assertEquals(expected,actual);
    }


    @Test
    void setMinChannel(){
        radio.setAnyChannel(-1);
        int actual = radio.getCurrentChannel();
        int expected = 0;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void setMaxChannel(){
        radio.setAnyChannel(10);
        int actual = radio.getCurrentChannel();
        int expected =0;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void setNextChannel(){
        radio.setCurrentChannel(8);
        radio.nextChannel();
        int actual = radio.getCurrentChannel();
        int expected = 9;
        Assertions.assertEquals(expected,actual);
    }


    @Test
    void setPrevChannel(){
        radio.setCurrentChannel(1);
        radio.prevChannel();
        int actual = radio.getCurrentChannel();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void setUnderMaxChannel(){
        radio.setCurrentChannel(9);
        radio.nextChannel();
        int actual = radio.getCurrentChannel();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void setUnderMinChannel(){
        radio.setCurrentChannel(0);
        radio.prevChannel();
        int actual = radio.getCurrentChannel();
        int expected = 9;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void increaseVolume(){
        radio.setCurrentVolume(15);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 16;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void decreaseVolume(){
        radio.setCurrentVolume(15);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 14;
        Assertions.assertEquals(expected,actual);
    }


    @Test
    void increaseVolumeMax(){
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void decreaseVolumeMin(){
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
}
