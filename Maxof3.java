import java.util.Scanner;

public class Maxof3 {
    public void maxi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1rst number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number");
        int c = sc.nextInt();
        int maxx = a;
        if(a<b && b>c){
            maxx = b;
        }
        else if(c>b && c>a){
            maxx = c;
        }
        System.out.println("The maximum of three numbers is: "+ maxx);
    }
}
