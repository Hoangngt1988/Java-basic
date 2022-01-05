package Day1;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Mercedes");
        car1.setLicense("43A-12345");
        car1.setWheel("4");
        car1.setDoor("5");
        car1.setEngine("I4");
        car1.setSeat("5");

        System.out.println("Brand: " + car1.brand);
        System.out.println("License: " + car1.license);
        System.out.println("Wheels: " + car1.wheel);
        System.out.println("Doors: " + car1.door);
        System.out.println("Engine: " + car1.engine);
        System.out.println("Seats: " + car1.seat);

        Car car2 = new Car();
        car2.setBrand("Mercedes");
        car2.setLicense("43A-12345");
        car2.setWheel("4");
        car2.setDoor("5");
        car2.setEngine("I4");
        car2.setSeat("5");

        System.out.println("Brand: " + car2.brand);
        System.out.println("License: " + car2.license);
        System.out.println("Wheels: " + car2.wheel);
        System.out.println("Doors: " + car2.door);
        System.out.println("Engine: " + car2.engine);
        System.out.println("Seats: " + car2.seat);

    }
}
