import java.util.*;
public class Arrays {
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int oddcount=0;
        int evencount=0;
        System.out.println(" enter the array elements ");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
            if(arr[i]%2==0) evencount++;
            else oddcount++;

            sum+=arr[i];
        }
        System.out.println();
        double avg=(double)(sum/n*1.0);
        //sum and average of the array
        System.out.println("sum of the array :"+ sum);
        System.out.println("average of the array :"+ avg);
        int x=0,y=n-1;
        while(x<=y)
        {
            int t=arr[x];
            arr[x]=arr[y];
            arr[y]=t;
            x++;
            y--;
        }
        //reversed array
        System.out.print("reversed array is : ");
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        System.out.println();
        // odd and even count
        System.out.println ("odd count : "+oddcount+" even count : "+evencount);
    }
    public void array2_question()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println(" enter the array elements ");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        List<Integer> l= new  ArrayList<>();
        List<Integer> r=new ArrayList<>();
        List<Integer> cd=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)l.add(arr[i]);
            else r.add(arr[i]);
            if(l.contains(arr[i])||r.contains(arr[i]))
            {
                cd.add(arr[i]);
            }
        }
        //positive and negative numbers
        System.out.println("negative numbers :");
        for(int i=0;i<l.size();i++) System.out.print(l.get(i)+" ");
        System.out.println("Positive  numbers :");
        for(int i=0;i<l.size();i++) System.out.print(l.get(i)+" ");
        System.out.println("Duplicate numbers :");
        for(int i=0;i<l.size();i++) System.out.print(l.get(i)+" ");

    }
    public void multiple()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the no of rows of array 1");
        int row1=sc.nextInt();
        System.out.println("please enter the no of columns of array 1");
        int col1=sc.nextInt();
        System.out.println("please enter the no of rows of array 2");
        int row2=sc.nextInt();
        System.out.println("please enter the no of columns of array 2");
        int col2=sc.nextInt();
        int[][] r1=new int[row1][col1];
        int[][] r2=new int[row2][col2];
        if(col1!=row2)
        {
            System.out.println("can't multiply");
            return ;
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                System.out.println("enter the :"+i+" row and "+j+" column of 1st 2d array");
                r1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.println("enter the :"+i+" row and "+j+" column of 2nd 2d array");
                r2[i][j]=sc.nextInt();
            }
        }
        int[][] res=new int[row1][col2];
        if(col1!=row2)
        {
            System.out.println("sorry we can't multiple ");
            return;
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                int sum=0;
                for(int k=0;k<col1;k++){
                    sum+=r1[i][col1]*r2[col1][col2];
                }
                res[i][j]=sum;
            }
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void addition ()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the no of rows of array 1");
        int row1=sc.nextInt();
        System.out.println("please enter the no of columns of array 1");
        int col1=sc.nextInt();
        System.out.println("please enter the no of rows of array 2");
        int row2=sc.nextInt();
        System.out.println("please enter the no of columns of array 2");
        int col2=sc.nextInt();
        int[][] r1=new int[row1][col1];
        int[][] r2=new int[row2][col2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                System.out.println("enter the :"+i+" row and "+j+" column of 1st 2d array");
                r1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.println("enter the :"+i+" row and "+j+" column of 2nd 2d array");
                r2[i][j]=sc.nextInt();
            }
        }
        int[][] res=new int[row1][col2];
        if(row1!=row2||col1!=col2)
        {
            System.out.println(" cant add");
            return;
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                res[i][j]=r1[i][j]+r2[i][j];
            }
        }
    }
}

