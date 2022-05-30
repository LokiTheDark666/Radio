package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void maxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void minVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void maxChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.nextChanel();
        int actual = radio.getCurrentChannel();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(8);
        radio.nextChanel();
        int actual = radio.getCurrentChannel();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void minChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.prevChanel();
        int actual = radio.getCurrentChannel();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void anyChannel() {
        Radio radio = new Radio();
        radio.getAnyChannel(-5);
        radio.getAnyChannel(33);
        radio.getAnyChannel(5);
        int actual = radio.getCurrentChannel();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void prevVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 4;
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void prevChannel(){
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.prevChanel();
        int actual = radio.getCurrentChannel();
        int expected = 4;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void anyVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-4);
        radio.setCurrentVolume(22);
        radio.setCurrentVolume(4);
        int actual = radio.getCurrentVolume();
        int expected =4;
        Assertions.assertEquals(expected,actual);
    }
}
