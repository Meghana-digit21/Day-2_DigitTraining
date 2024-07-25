import java.util.Scanner;

public class PostPreInc {
    public void pp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer");
        int n = sc.nextInt();
        System.out.println("Post increment "+ (n++));
        System.out.println("Pre increment "+ (++n));
    }
}
