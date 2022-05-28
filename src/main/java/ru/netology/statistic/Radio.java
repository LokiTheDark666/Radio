package ru.netology.statistic;

public class Radio {

    private int currentVolume;
    private int currentChannel;

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < 0) {
            return;
        }
        if (newCurrentChannel > 9) {
            return;
        }
        currentChannel = newCurrentChannel;
    }

    public void nextChanel() {
        if (currentChannel < 9) {
            currentChannel = currentChannel + 1;
        } else currentChannel = 0;
    }

    public void prevChanel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        } else currentChannel = 9;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

}
