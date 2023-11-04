package Classes;

public class ClassVehicle {
    static class Vehicle {
        private String type;
        private String model;
        private Engine engine;
        private int fuel;

        public Vehicle (String type, String model, Engine engine, int fuel) {
            this.type = type;
            this.model = model;
            this.engine = engine;
            this.fuel = fuel;
        }

        public int getFuel() {
            return fuel;
        }
        public void drive(int fuelLoss) {
            this.fuel -= fuelLoss;
        }

    }
    static class Engine {
        private int power;
        public Engine (int power) {
            this.power = power;
        }
    }
    public static void main(String[] args) {
        Engine engine = new Engine(100);
        Vehicle vehicle = new Vehicle("a", "b", engine, 200);
        vehicle.drive(100);
        System.out.println(vehicle.getFuel());
    }
}
