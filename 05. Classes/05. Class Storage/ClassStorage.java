package Classes;

import java.util.ArrayList;
import java.util.List;

public class ClassStorage {
    public static class Storage {
        private int capacity;
        private List<Product> storage;
        private double totalCost;

        public Storage(int capacity) {
            this.capacity = capacity;
            this.storage = new ArrayList<>();
            this.totalCost = 0.0;
        }

        public void addProduct(Product product) {
            String name = product.getName();
            double price = product.getPrice();
            int quantity = product.getQuantity();
            storage.add(product);
            totalCost += price * quantity;
            capacity -= quantity;
        }

        public String getProducts() {
            StringBuilder result = new StringBuilder();

            for (Product product : storage) {
                String productJson = String.format("{\"name\": \"%s\", \"price\": %.2f, \"quantity\": %d}",
                        product.getName(), product.getPrice(), product.getQuantity());
                result.append(productJson).append("\n");
                // result.append(product.toString()).append("\n"); // non JSON
            }

            return result.toString();
        }

        public int getCapacity() {
            return capacity;
        }

        public double getTotalCost() {
            return totalCost;
        }

        public static class Product {
            private String name;
            private double price;
            private int quantity;

            public Product(String name, double price, int quantity) {
                this.name = name;
                this.price = price;
                this.quantity = quantity;
            }

            public String getName() {
                return name;
            }

            public double getPrice() {
                return price;
            }

            public int getQuantity() {
                return quantity;
            }

            @Override
            public String toString() {
                return String.format("Name: %s, Price: %.2f, Quantity: %d", name, price, quantity);
            }
        }
    }

    public static void main(String[] args) {
        Storage storage = new Storage(50);
        storage.addProduct(new Storage.Product("cucumber", 1.50, 15));
        storage.addProduct(new Storage.Product("tomato", 0.90, 25));
        storage.addProduct(new Storage.Product("bread", 1.10, 8));
        System.out.println(storage.getProducts());
        System.out.println(storage.getCapacity());
        System.out.println(storage.getTotalCost());
    }
}
