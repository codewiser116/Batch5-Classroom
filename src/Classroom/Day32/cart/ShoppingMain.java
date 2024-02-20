package Classroom.Day32.cart;

public class ShoppingMain {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop",500, 5);
        Product product2 = new Product("Screen protector",8, 2);

        ShoppingCart cart = new ShoppingCart();
        cart.add(product1);
        cart.add(product2);

        cart.displayProducts();

        cart.add(product1);
        cart.add(product2);

        cart.displayProducts();
    }
}
