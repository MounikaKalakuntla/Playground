import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int originalnumber=153, remainder, result = 0;
      while(originalnumber != 0)
      {
        remainder = originalnumber % 10;
        result +=Math.pow(remainder,3);
        originalnumber /=10;
      }
      if(result == n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}