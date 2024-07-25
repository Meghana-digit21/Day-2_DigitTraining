import java.util.Scanner;

public class Addsub {
    public void as(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1rst number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        int diff = a-b;
        int summ = a+b;
        System.out.println("The sum of two numbers is: "+ summ);
        System.out.println("The difference of two numbers is: "+ diff);

    }
}
