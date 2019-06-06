import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i <= n - 1; i++)
        {
            arr[i] = in.nextInt();
        }
      int l;
      if(arr[0] > arr[1])
      {
        l = arr[0];
      }
      else
      {
        l = arr[1];
      }
      for(int i = 2; i <= n-1; i++)
      {
        if(l < arr[i])
        {
          l = arr[i];
        }
      }
      System.out.println(l);
    }
}