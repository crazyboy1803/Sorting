import java.util.Scanner;
public class SelectionSortExample 
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];
        
        //step 1 input
        System.out.println("Enter the element in array");
        for(int i =0;i<ar.length;i++)
        {
            ar[i] = sc.nextInt();
        }
        
        //step 2 process
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i;j<ar.length;j++)
            {
                if(ar[i]>ar[j])
                {
                    int temp = ar[j];
                    ar[j]=ar[i];
                    ar[i]=temp;
                }
            }
        }
        
        //step 3 output
        System.out.println("------------Selection sort------------");
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }
    public static void main(String args[])
    {
        SelectionSortExample obj = new SelectionSortExample();
        obj.func();
    }
}
