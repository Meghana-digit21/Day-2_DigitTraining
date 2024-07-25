import java.util.Scanner;

public class AndOrXor {
    public void aox(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer");
        int a = sc.nextInt();
        System.out.println("Enter another integer");
        int b = sc.nextInt();
        int c = (a&b);
        System.out.println("AND operation of two numbers a&b is "+ c);
        c = (a|b);
        System.out.println("AND operation of two numbers a|b is "+ c);
        c = (a^b);
        System.out.println("AND operation of two numbers a^b is "+ c);
    }
}
