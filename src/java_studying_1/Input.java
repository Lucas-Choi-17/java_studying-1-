package java_studying_1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String name = "";
        String lastname = "";
        String fullname = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.next();
        // next() method returns string up to the space
        System.out.println(name);
        //returning next token
        lastname = sc.next();
        System.out.println(lastname);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("What is your name?");
        fullname = sc1.nextLine();
        // returning whole line up to the '\n'
        System.out.println(fullname);

        int num1 = 0, num2 = 0;

        Scanner sc2 = new Scanner(System.in);
        System.out.print("input two integer ex) 1 4 : ");
        num1 = sc2.nextInt();
        System.out.println("first integer: " + num1);
        num2 = sc2.nextInt();
        System.out.println("second integer : " + num2);
        System.out.println("sum = " + (num1 + num2));

        int num3 = 0, num4 = 0;

        Scanner sc3 = new Scanner(System.in);
        System.out.println("input two integer ex) 1 4 : ");
        num3 = Integer.parseInt(sc3.next());
        num4 = Integer.parseInt(sc3.next());
        System.out.println("result : " + (num3 + num4));
    }
}
