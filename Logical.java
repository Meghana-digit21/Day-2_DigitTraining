import java.util.*;
public class Logical {
    public void fibonnaci(int n)
    {
        if(n<=1)
        {
            System.out.print(0+" ");
            if(n==0) {
                return;
            }
            System.out.print(1+" ");
            return;
        }
        int p2=0;
        int p1=1;
        System.out.print(0+" "+1+" ");
        for(int i=2;i<=n;i++)
        {
            int t=p1+p2;
            p2=p1;
            p1=t;
            System.out.print(t+" ");
        }
    }
    public void perfect(int n)
    {
        int sum=0;
        for(int i=1;i*i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
                sum+=n/i;
            }
            i++;
        }
        sum=sum-n;
        if(sum==n) System.out.println(n+"  is perfect number ");
        else System.out.println(n+"  is not a perfect number ");
    }
    public void isPrime(int n)
    {
        int cnt=0;
        if(n==1||n==0)
        {
            System.out.println("it is not a prime number");
        }
        for(int i=1;i*i<n;i++)
        {
            if(n%i==0) cnt+=2;
        }
        if(cnt==2)
        {
            System.out.println("it is a prime number");
        }
        else {
            System.out.println("it is not a prime number");
        }
    }
    public int reverse(int n)
    {
        int res=0;
        while(n!=0)
        {
            int t=n%10;
            res=10*res+t;
        }
        return res;
    }
}
