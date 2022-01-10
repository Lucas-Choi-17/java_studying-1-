package java_studying_1;

public class OperTest {
    public static void main(String[] args) {
        System.out.println(10 == 20); // false
        System.out.println(10 == 10 && 20 > 30); // true && false -> false
        System.out.println(10 == 10 || 20 > 30); // true || false -> true
        System.out.println(!(10 > 30)); // NOT false -> true
    }
}
