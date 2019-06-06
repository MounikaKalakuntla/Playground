import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i, p, r, sum = 0, save_num;
      save_num = num;
      while(num != 0)
      {
        i = 1;
        p = 1;
        r = num % 10;
        while(i <= r)
        {
          p = p*i;
          i++;
        }
        sum = sum + p;
        num = num / 10;
      }
      if(sum == save_num)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");  
      }
	}
}