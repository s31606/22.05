public class Main {
    public static void main(String[] args) {
        Car c = new Car("Audi", "Q7", 2005, 135.5, 10.4);

        Truck t = new Truck("Volvo", "FL 240", 2014, 540, 16.2, 3000);

        System.out.println(c.calculateFuelEfficiency());
        System.out.println(t.calculateFuelEfficiency());
    }
}