package ch12_generics.enums;

public abstract class TransportationMyEnumImpl extends MyEnum {

    public static final TransportationMyEnumImpl BUS = new TransportationMyEnumImpl("BUS", 100) {
        @Override
        int getFareByDistance(int distance) {
            return getFare() * distance;
        }
    };
    public static final TransportationMyEnumImpl TRAIN = new TransportationMyEnumImpl("TRAIN", 150) {
        @Override
        int getFareByDistance(int distance) {
            return getFare() * distance;
        }
    };
    public static final TransportationMyEnumImpl SHIP = new TransportationMyEnumImpl("SHIP", 100) {
        @Override
        int getFareByDistance(int distance) {
            return getFare() * distance;
        }
    };
    public static final TransportationMyEnumImpl AIRPLANE = new TransportationMyEnumImpl("AIRPLANE", 300) {
        @Override
        int getFareByDistance(int distance) {
            return getFare() * distance;
        }
    };

    public TransportationMyEnumImpl(String name, int fare) {
        super(name, id);
        this.fare = fare;
        ordinal = id++;
    }

    private int fare;
    private static int id;
    private int ordinal;

    abstract int getFareByDistance(int distance);

    public int getFare() {
        return fare;
    }

}
