public class Main {
    public static void main(String[] args) {
        String menu = "아메리카노";
        int quantity = 2;
        int price = Menu.getPrice(menu);
        int total = OrderCalculator.calculate(price, quantity);
        System.out.println(OrderSummary.format(menu, quantity, total));
    }
}
