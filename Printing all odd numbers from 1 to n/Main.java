import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int count=1;count<=n;count++)
      {
        if(count %2 != 0)
        {
          System.out.println(count);
        }                  
	}
}
}