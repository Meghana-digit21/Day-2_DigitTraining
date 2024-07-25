import java.util.Scanner;

public class Divisibilitycheck {
    public void divv(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a%5==0 && a%7==0){
            System.out.println("The number is divisible both by 5 and 7");
        }
        else if(a%5==0 && a%7!=0){
            System.out.println("The number is divisible by 5 but not 7");
        }
        else if (a%5!=0 && a%7==0){
            System.out.println("The number is divisible by 7 but not 5");
        }
        else {
            System.out.println("The number is not divisible by both 5 and 7");
        }
    }
}
