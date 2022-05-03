package ch12_generics.enums;

public abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T> {

    private int ordinal;
    private final String name;

    public MyEnum(String name, int ordinal) {
        this.ordinal = ordinal;
        this.name = name;
    }

    public int ordinal() {
        return ordinal;
    }

    public final String name() {
        return name;
    }

    @Override
    public int compareTo(MyEnum o) {
        return ordinal - o.ordinal();
    }
}
