package java_studying_1;

public class PrintTest {
    public static void main(String[] args) {

        System.out.print("Hello World!...\n");
        System.out.println("man");

        int i = 10;
        long l = 100;
        double d = 1.23;
        float f = 1.23F;
        char c = 'A';
        String s = "Lucas";
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(c);
        System.out.println(s);
        System.out.println("-------------------");
        System.out.printf("%d\n", i);
        System.out.printf("%o\n", i);
        System.out.printf("%x\n", i);
        System.out.printf("%d\n", l);
        System.out.printf("%f\n", d);
        System.out.printf("%.2f\n", f);
        System.out.printf("%c\n", c);
        System.out.printf("%s\n", s);
    }
}