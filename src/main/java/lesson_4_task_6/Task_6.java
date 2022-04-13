package lesson_4_task_6;

public class Task_6 {
    public static void main(String[] args) {
        Payment payment = new Payment();
        System.out.println("На данный момент в списке " + payment.countProducts() + " продуктов");
        System.out.println(payment);
        System.out.println("////////////////////////////////");
        payment.addProduct(new Payment.Product("iPhone 13 Pro", 4560000));
        System.out.println(payment);
        System.out.println("После добавления одного продукта в список: " + payment.countProducts() + " продуктов");
        System.out.println("////////////////////////////////");
        payment.deleteProduct(payment.products.get(payment.countProducts() - 1));
        System.out.println(payment);
        System.out.println("После удаления последнего продукта из списка: " + payment.countProducts() + " продуктов");
        System.out.println("////////////////////////////////");
        System.out.println("Сумма товаров: " + payment.sumProducts());
    }
}
