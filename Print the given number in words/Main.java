import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n==1)
      {
        System.out.println("one");
      }
      else if(n==2)
        System.out.println("Two");
      else if(n==3)
        System.out.println("Three");
      else if (n==4)
        System.out.println("FOUR");
      else if (n==5)
        System.out.println("FIVE");
      else
        System.out.println("Invalid");
    }
}