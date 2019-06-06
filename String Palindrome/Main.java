import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      String rev="";
      Scanner sc = new Scanner(System.in);
      String str=sc.nextLine();
      int str_length=str.length();
      for(int idx=(str_length-1);idx>=0;idx--)
      {
       rev = rev+str.charAt(idx); 
        }
      if(str.equals(rev))
      {
        System.out.println("Yes");
      }
      else
      {
       System.out.println("No"); 
        }
    } 
}