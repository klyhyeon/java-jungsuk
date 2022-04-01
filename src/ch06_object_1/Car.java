package ch06_object_1;

public class Car {

    {
        color = "none";
        System.out.println("non static { }");
    }

    private String color;
    private String brand;

    public Car() {
        this("white", "hyundai");
        System.out.println("Car 생성자");
    }

    public Car(String color) {
        this();
    }

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }
}
