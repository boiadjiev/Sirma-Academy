package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarConstructors {
    static class Car {
        private String brand;
        private String model;
        private int horsePower;

        public Car(String brand, String model, int horsePower) {
            this.brand = brand;
            this.model = model;
            this.horsePower = horsePower;
        }

        public Car(String brand, String model) {
            this.brand = brand;
            this.model = model;
            this.horsePower = -1;
        }

        public Car(String brand) {
            this.brand = brand;
            this.model = "unknown";
            this.horsePower = -1;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        public String carInfo() {
            return "The car is: " + getBrand() + " " + getModel() + " - " + getHorsePower() + " HP.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputCar = sc.nextLine().split(" ");
            if (inputCar.length == 1) {
                cars.add(new Car(inputCar[0]));
            } else if (inputCar.length == 2) {
                cars.add(new Car(inputCar[0], inputCar[1]));
            } else if (inputCar.length == 3){
                cars.add(new Car(inputCar[0], inputCar[1], Integer.parseInt(inputCar[2])));
            }
        }

        for (Car car : cars) {
            System.out.println(car.carInfo());
        }
    }
}
