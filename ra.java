// Write a program to accept the array element and display in reverse order.
import java.util.Scanner;
public class ra
 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter How Many Elements:");
		int n=sc.nextInt();
		
		String a[] = new String [n];
		
        for(int i=0;i<n;i++)
		{           
            System.out.println("Enter "+(1+i)+" Number :");
            a[i]=sc.next();
    	}
    	
    	System.out.println("Reverse Array is :");
    	
    	for(int i=a.length-1;i>=0;i--)
    	{
    		System.out.println(a[i]);
    	}
		sc.close();
	}
}
