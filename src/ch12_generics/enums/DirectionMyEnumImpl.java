package ch12_generics.enums;

public class DirectionMyEnumImpl extends MyEnum {

    static final DirectionMyEnumImpl EAST = new DirectionMyEnumImpl("EAST");
    static final DirectionMyEnumImpl WEST = new DirectionMyEnumImpl("WEST");
    static final DirectionMyEnumImpl NORTH = new DirectionMyEnumImpl("NORTH");
    static final DirectionMyEnumImpl SOUTH = new DirectionMyEnumImpl("SOUTH");

    public DirectionMyEnumImpl(String name) {
        super(name, id);
        ordinal = id++;
    }

    private static int id;

    private int ordinal;

}
