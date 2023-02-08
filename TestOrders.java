public class TestOrders {
  public static void main(String[] args) {
    CoffeeKiosk coffeeKiosk = new CoffeeKiosk();
    coffeeKiosk.addMenuItem("banana", 1.50);
    coffeeKiosk.addMenuItem("coffee", 2.25);
    coffeeKiosk.addMenuItem("latte", 4.35);
    coffeeKiosk.addMenuItem("cappuccino", 4);
    coffeeKiosk.addMenuItem("muffin", 3);
  
    coffeeKiosk.newOrder();
  }
}
