// Julia Wang
// APCS Period 1
// Tests a simple shopping program to calculate prices and discounts.

public class ShoppingMain {
    public static void main(String[] args) {
        Catalog list = new Catalog("CS Gift Catalog");
        list.add(new Item("Play-Doh", 3.95, 10, 19.99));
        list.add(new Item("Noisemaker", 3.50, 10, 14.95));
        list.add(new Item("Balloon", 0.99));
        list.add(new Item("Nintendo Switch", 389.99));
        list.add(new Item("Computer game", 49.99));
        list.add(new Item("Gift card", 49.99));
        list.add(new Item("Bubbles", 3.40));
        list.add(new Item("Rubik's cube", 9.10));
        list.add(new Item("Action figure", 19.99));
        list.add(new Item("Sticker", 0.99, 10, 5.0));
        list.add(new Item("Mechanical pencil", 0.99, 20, 8.95));

        ShoppingFrame f = new ShoppingFrame(list);
        f.setVisible(true);
    }
}
