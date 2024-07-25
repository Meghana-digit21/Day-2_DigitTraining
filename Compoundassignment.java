import java.util.Scanner;

public class Compoundassignment {
    public void compAss(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1rst number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        a += b;
        System.out.println("The value of a after a+=b is "+ a);
        a -= b;
        System.out.println("The value of a after a-=b is "+ a);
        a /= b;
        System.out.println("The value of a after a/=b is "+ a);
        a*=b;
        System.out.println("The value of a after a*=b is "+ a);
        a %= b;
        System.out.println("The value of a after a%=b is "+ a);


    }
}
