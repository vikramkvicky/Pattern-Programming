import java.util.*;
public class Ptr4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of row");
		int row=scan.nextInt();
		System.out.println("Enter the value of column");
		int column=scan.nextInt();
		System.out.println("Enter The What value has to be printed");
        char ch=scan.next().charAt(0);
        
        for(int i=0;i<=row;i++)
        {
        	for(int j=0;j<=column;j++)
        	{
        		System.out.print(ch);
        	}
        	
        	System.out.println();
        }

	}

}
