import java.util.Scanner;

public class Toggleboolean {
    public void noo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a boolean: ");
        boolean b = sc.nextBoolean();
        System.out.println(!b);
    }
}
