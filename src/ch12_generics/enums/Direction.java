package ch12_generics.enums;

public enum Direction {

    SOUTH(1),
    EAST(2),
    WEST(3),
    NORTH(4);

    private int index;

    Direction(int index) {
        this.index = index;
    }
}
