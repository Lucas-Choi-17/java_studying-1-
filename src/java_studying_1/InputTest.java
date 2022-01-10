package java_studying_1;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input age : ");
        sc.nextInt();
        System.out.print("input name: ");
        sc.nextLine(); // buffer is containing '\n' so sc.nextLine() returns nothing
        sc.nextLine();
    }
}