package ch12_generics.enums;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Transportation compare: " +  TransportationMyEnumImpl.TRAIN.compareTo(TransportationMyEnumImpl.BUS));

        System.out.println(TransportationMyEnumImpl.BUS.name());
        System.out.println(TransportationMyEnumImpl.BUS.getFare());
        System.out.println(TransportationMyEnumImpl.BUS.ordinal());

        System.out.println(TransportationMyEnumImpl.TRAIN.name());
        System.out.println(TransportationMyEnumImpl.TRAIN.getFare());
        System.out.println(TransportationMyEnumImpl.TRAIN.ordinal());

        System.out.println(DirectionMyEnumImpl.EAST.name());
        System.out.println(DirectionMyEnumImpl.EAST.ordinal());

        System.out.println(DirectionMyEnumImpl.SOUTH.name());
        System.out.println(DirectionMyEnumImpl.SOUTH.ordinal());

        System.out.println(DirectionMyEnumImpl.SOUTH.compareTo(DirectionMyEnumImpl.EAST));

        TransportationMyEnumImpl t1 = TransportationMyEnumImpl.BUS;
        TransportationMyEnumImpl t1_dup = TransportationMyEnumImpl.BUS;
        TransportationMyEnumImpl t2 = TransportationMyEnumImpl.TRAIN;
        TransportationMyEnumImpl t3 = TransportationMyEnumImpl.AIRPLANE;
        TransportationMyEnumImpl t4 = TransportationMyEnumImpl.SHIP;

        System.out.printf("t1=%s, %d%n", t1.name(), t1.ordinal());
        System.out.printf("t2=%s, %d%n", t2.name(), t2.ordinal());
        System.out.printf("t3=%s, %d%n", t3.name(), t3.ordinal());
        System.out.printf("t4=%s, %d%n", t4.name(), t4.ordinal());
        System.out.printf("t1_dup=%s, %d%n", t1_dup.name(), t1_dup.ordinal());
        System.out.println("========================");

        System.out.println("Train fare:  " + Transportation.TRAIN.fare(10));
        System.out.println(Transportation.TRAIN.BASIC_FARE);

        Direction dir = Direction.EAST;
        switch (dir) {
            default:
                break;
        }

        if (dir == Direction.NORTH) {
            return;
        }

        Direction[] dArr = Direction.values();
        Arrays.sort(dArr);


        for (Direction d : dArr) {
            //ordinal은 Enum 수정에 취약하기 때문에 인스턴스 필드를 사용해야 합니다.
            System.out.println(d.name() + " == " + d.ordinal());
        }


    }
}
