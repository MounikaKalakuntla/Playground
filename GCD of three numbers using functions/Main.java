import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int gcd = 1;
      for(int i = 1;i<=n1 && i<=n2;i++)
      {
        if(n1%i==0 && n2%i==0)
          gcd = i;
      }
      int temp = gcd;
      for( int i = 1;i<=temp && i <= n3;i++)
      {
        if( temp%i==0 && n3%i==0)
          gcd=i;
         
      }
      System.out.print(gcd);
	}
}