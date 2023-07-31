import java.util.Scanner;
public class Ptr13 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int m = scan.nextInt();
    
    System.out.println("Enter the number of columns");
    int n = scan.nextInt();
    
    System.out.println("Enter what to be printedin first ");
    char ch1 = scan.next().charAt(0);
  
    
    for(int i =1; i<=m;i++ )
    {
      for(int j =1; j<=(n-i+1); j++)
      {
        System.out.print("-");
      }
      
      for (int j=1; j<=(i*2-1); j++)
      {
        System.out.print(ch1);
      }
      System.out.println();
    }
    for(int i =2; i<=m;i++ )
    {
      for(int j =1; j<=i; j++)
      {
        System.out.print("-");
      }
      
      for (int j=1; j<=(11-2*i); j++)
      {
        System.out.print(ch1);
      }
      System.out.println();
    }
  }
}