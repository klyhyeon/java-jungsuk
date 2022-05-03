package ch12_generics.enums;

public enum Transportation {

    BUS(100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    TRAIN(150){
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    SHIP(100){
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    AIRPLANE(300){
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };


    protected final int BASIC_FARE;

    Transportation(int fare) {
        this.BASIC_FARE = fare;
    }

    abstract int fare(int distance);

    public int getBasicFare() {
        return BASIC_FARE;
    }
}
