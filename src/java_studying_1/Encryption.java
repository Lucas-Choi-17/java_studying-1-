package java_studying_1;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        int data = 'A';
        char data2 = 65;
        // converted according to ascii code
        System.out.println(data); // 65
        System.out.println(data2); // A

        String pw = null;
        System.out.println("PW : ");
        pw = new Scanner(System.in).next();
        System.out.println("Encrypted pw : ");
        for (int i = 0; i < pw.length(); i++) {
            System.out.print((char) (pw.charAt(i) - 10));
            // calculated (string type pw + int type 10) == int type
            // with (char) convert int type to char type
        }
    }
}