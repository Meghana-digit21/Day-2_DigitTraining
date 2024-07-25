import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Addition subtraction program");
        Addsub a = new Addsub();
        a.as();
        System.out.println("Multiplication program");
        Multiplicationtable mc = new Multiplicationtable();
        mc.mul();
//        System.out.println("Average Calculation");
//        System.out.println("Circle Measurements");
        System.out.println("Maximum of three numbers");
        Maxof3 m = new Maxof3();
        m.maxi();
//        System.out.println("Equality Check");
//        System.out.println("Leap Year Check");
        System.out.println("Divisibility Check");
        Divisibilitycheck dv = new Divisibilitycheck();
        dv.divv();
        System.out.println("Compound Assignments");
        Compoundassignment ca = new Compoundassignment();
        ca.compAss();
        System.out.println("Post increment and Pre increment");
        PostPreInc pop = new PostPreInc();
        pop.pp();
        System.out.println("Toggle Boolean");
        Toggleboolean tob = new Toggleboolean();
        tob.noo();
        System.out.println("Bitwise AND, OR, XOR");
        AndOrXor andd = new AndOrXor();
        andd.aox();
        System.out.println("Bitwise Shifts-1");
        BitwiseShifts bs = new BitwiseShifts();
        bs.bit();
//        System.out.println("Bitwise Shifts-2");
        System.out.println("Odd or Even");
        OddorEven oo = new OddorEven();
        oo.ov();
//        System.out.println("Min of 2 numbers");
        System.out.println("Pass or Fail");
        PassorFail pff = new PassorFail();
        pff.pf();
        System.out.println("Arrays Questions");
        Arrays arrr = new Arrays();
        arrr.display();
        arrr.array2_question();
        arrr.addition();
        arrr.multiple();
        System.out.println("Logical Questions");
        Scanner sc=new Scanner(System.in);
        Logical lo = new Logical();
        System.out.println("enter the number for fibonnacci series");
        int n=sc.nextInt();
        lo.fibonnaci(n);
        System.out.println("enter the number to check perfect");
        int num=sc.nextInt();
        lo.perfect(n);
        System.out.println("enter the number to check prime");
        int nn=sc.nextInt();
        lo.isPrime(nn);
        System.out.println("enter the number to be reverse");
        int r=sc.nextInt();
        System.out.println("reversed number is :"+ r);
    }
}