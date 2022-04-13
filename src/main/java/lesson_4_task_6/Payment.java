package lesson_4_task_6;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    List<Product> products = new ArrayList<Product>() {
        {
            add(new Product("Майка", 200));
            add(new Product("Джинсы", 300));
            add(new Product("Кроссовки", 280));
            add(new Product("Ремень", 1000));
            add(new Product("Куртка", 2500));
        }
    };

    public int sumProducts() {
        int sum = 0;
        for (int i = 0; i < products.size(); i++) {
            sum += products.get(i).getPrice();
        }
        return sum;
    }

    public void addProduct(Product pr) {
        products.add(pr);
    }

    public void deleteProduct(Product pr) {
        products.remove(pr);
    }

    public int countProducts() {
        return products.size();
    }

    public static class Product {
        String name;
        int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    @Override
    public String toString() {
        String str = "Payment{\n\tproducts=";
        for (Product result : products) {
            str += "\n\t\t" + result;
        }
        return str + "\n}";
    }
}
