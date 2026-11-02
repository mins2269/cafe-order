public class OrderSummary {
    public static String format(String menu, int quantity, int total){
        return "카페 주문 내역" +
                "\n메뉴: " + menu + ", 수량: " + quantity +
                "\n" + "총금액: " + total + "원";
    }
}
