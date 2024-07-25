import java.util.Scanner;

public class OddorEven {

    public void ov(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to heck if its even or odd");
        int n = sc.nextInt();
        if((n&1) != 0){
            System.out.println("The number is a odd number");
        }
        else{
            System.out.println("The number is a even number");
        }
    }
}
