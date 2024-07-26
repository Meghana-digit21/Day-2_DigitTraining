import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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

        System.out.println("Palindrome Check");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        Palindrome p = new Palindrome();
        boolean isPalindrome = p.isPalindrome(input);
        System.out.println("Is the string a palindrome? " + isPalindrome);

        System.out.println("String Anagram");
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        AnagramCheck ana = new AnagramCheck();
        boolean isAnagram = ana.areAnagrams(str1, str2);
        System.out.println("Are the strings anagrams? " + isAnagram);

        System.out.println("Character Frequency Count");
        System.out.print("Enter a string: ");
        String input1 = sc.nextLine();
        CharFreqCount cfq = new CharFreqCount();
        Map<Character, Integer> frequencyMap = cfq.getCharacterFrequency(input1);
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Longest Substring without Repeating Characters");
        System.out.print("Enter a string: ");
        String input2 = sc.nextLine();
        LongestSubsWithoutRep lswr = new LongestSubsWithoutRep();
        int length = lswr.lengthOfLongestSubstring(input2);
        System.out.println("Length of the longest substring without repeating characters: " + length);




        System.out.println("Logical Questions");
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

        System.out.println("Stopwatch Program");
        Stopwatch stopwatch = new Stopwatch();
        System.out.println("Press Enter to start the stopwatch.");
        sc.nextLine();
        stopwatch.start();
        System.out.println("Press Enter to stop the stopwatch.");
        sc.nextLine();
        stopwatch.stop();
        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Elapsed time in milliseconds: " + elapsedTime);
        System.out.println("Elapsed time in seconds: " + elapsedTime / 1000.0);


        System.out.print("Enter the number of distinct coupon numbers: ");
        int Num = sc.nextInt();
        CouponNumbers cn = new CouponNumbers();
        int totalRandomNumbers = cn.generateDistinctCoupons(Num);
        System.out.println("Total random numbers needed to generate all distinct coupons: " + totalRandomNumbers);


    }
}

