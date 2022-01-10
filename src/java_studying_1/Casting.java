package java_studying_1;

public class Casting {
    public static void main(String[] args) {
        //Implicit conversion(Promotion/Upcasting) = 자동형변환 : converting a smaller type to a larger type size
        System.out.println(11 / 9); // 1
        System.out.println(11 / 9.0); // 1.222223
        //casting
        //Explicit conversion(Demotion/Downcasting) = 강제형변환 : converting a larger type to a smaller size type
        System.out.println((double) 11 / 9); // 1.222223
        System.out.println((int) 8.43 + 2.59); // 10.59
        System.out.println((int) (8.43 + 2.59)); // 11
        System.out.println((int) 8.43 + (int) 2.59); // 10

        //converting char
        String num1 = "1";
        String num2 = "2";
        int num3 = 3;

        System.out.println(num1 + num2); // 12
        System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2)); // 3
        // because String is class type, String should be converted into Integer
        System.out.println("" + num3); // 3
        // String type + int type == String type
    }
}