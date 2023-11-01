package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarInfo {
    static class Car {
        private String brand;
        private String model;
        private int horsePower;

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
            Car car = new Car();
            car.setBrand(inputCar[0]);
            car.setModel(inputCar[1]);
            car.setHorsePower(Integer.parseInt(inputCar[2]));
            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car.carInfo());
        }
    }
}
