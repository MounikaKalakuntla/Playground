import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      if(n1>n2 && n1>n3)              
          System.out.print(n1);
      else if(n2>n1 && n2>n3)
        System.out.print(n2);
      else if(n3>n1 && n3>n2)
         System.out.print(n3);
	}
}