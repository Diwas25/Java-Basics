package CommonPractices.ShoppingCart;

public class CartDemo {
    public static void main(String[] args) {
        Item pen = new Item("pen",1,15);
        Item laptop = new Item("laptop",1,15000);
        Item mobile = new Item("mobile",2,20000);
        Item pen2 = new Item("pen 1",1,23);
        Item pen3 = new Item("pen 2",1,11);

        ShoppingCart flipkart = new ShoppingCart(3);
        flipkart.addItems(pen);
        flipkart.addItems(laptop);
        flipkart.addItems(mobile);


        System.out.println("Total cart price : "+flipkart.calculateTotalPrice());
    }
}
