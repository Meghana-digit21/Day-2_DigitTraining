import java.util.Scanner;

public class PassorFail {
    public void pf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student to check if pass or fail");
        int n = sc.nextInt();
        String b = n>40 ? "Pass" : "Fail";
        System.out.println(b);
    }
}
