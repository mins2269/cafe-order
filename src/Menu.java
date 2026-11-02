public class Menu {
    public static int getPrice(String name) {
        if (name == null) {
            return 0;   // null이 들어오면 없는 메뉴로 처리
        }
        if (name.equals("아메리카노")) {
            return 3000;
        }
        if (name.equals("라테")) {
            return 4000;
        }
        //없는 메뉴
        return 0;
    }
}