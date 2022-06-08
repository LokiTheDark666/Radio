package ru.netology.statistic;

public class Radio {

    private int currentVolume;
    private int currentChannel;
    private int channelQuantity;

    public Radio(int channelQuantity)
    {
       this.channelQuantity = channelQuantity;
    }

    public Radio() {
        this.channelQuantity = 10;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < 0) {
            return;
        }
        if (currentChannel >= channelQuantity) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setAnyChannel(int newChannel) {
        setCurrentChannel(newChannel);
    }

    public int getChannelQuantity() {
        return channelQuantity;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextChannel() {
        int newCurrentChannel;
        if (currentChannel < channelQuantity - 1) {
            newCurrentChannel = currentChannel + 1;
        } else {
            newCurrentChannel = 0;
        }
        setCurrentChannel(newCurrentChannel);
    }

    public void prevChannel() {
        int newCurrentChannel;
        if (currentChannel > 0) {
            newCurrentChannel = currentChannel - 1;
        } else {
            newCurrentChannel = channelQuantity - 1;
        }
        setCurrentChannel(newCurrentChannel);
    }

    public void increaseVolume(){
        int newCurrentVolume = currentVolume+1;
        setCurrentVolume(newCurrentVolume);
    }

    public void decreaseVolume(){
        int newCurrentVolume = currentVolume-1;
        setCurrentVolume(newCurrentVolume);
    }
}


