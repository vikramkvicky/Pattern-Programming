import java.util.*;
public class Ptr2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The n Value");
		int n = scan.nextInt();
		System.out.println("what the char which has to be printed");
		char ch = scan.next().charAt(0);
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(ch);
		}
		

	}

}
