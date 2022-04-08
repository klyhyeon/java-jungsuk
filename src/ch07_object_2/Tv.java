package ch07_object_2;

public class Tv {

    boolean power;
    int channel;

    void power() {
        this.power = !this.power;
    }

    void channelUp() {
        this.channel++;
    }

    void channelDown() {
        this.channel--;
    }
}
