import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     int i,fact = 1;
      for(i =1 ; i<=n; i++)
      {
        fact = fact * i;
      }
      System.out.println(fact);
	}
}