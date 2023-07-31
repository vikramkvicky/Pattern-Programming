import java.util.Scanner;
public class Ptr8 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int m = scan.nextInt();
    
    System.out.println("Enter the number of columns");
    int n = scan.nextInt();
    
    System.out.println("Enter what to be printedin first ");
    char ch1 = scan.next().charAt(0);
    
    //System.out.println("Enter what to be printed in second");
    //char ch2 = scan.next().charAt(0);
    
    
    
    for(int i =1; i<=m;i++ )
    {
      for(int j =1; j<=n; j++)
      {
        System.out.print("-");
      }
      
      for (int j=1; j<=i; j++)
      {
        System.out.print(ch1);
      }
      System.out.println();
    }
    
  }
}