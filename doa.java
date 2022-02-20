// Write a program to accept n names of country and display them in descending
//order.
import java.util.Scanner;
class doa
{
    public static void main(String arg[])
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many city you want to enter : ");
        int n = sc.nextInt();
        String s[]= new String[n];
        String temp;

        System.out.print("Enter 5 cities: ");
        for(int i=0;i<n;i++)
        {            
            s[i]=sc.next();
        }
        
        for(int j=0;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if((s[j].compareTo(s[k]))<0)
                {
                    temp=s[j];
                    s[j]=s[k];
                    s[k]=temp;
                }
            }
        }
        
        System.out.println("Sorted City Are :");
        
        for(int i=0;i<n;i++)
        {         
            System.out.println(s[i]);
        }
    }
}
