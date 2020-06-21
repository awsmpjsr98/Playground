import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      int n1,n3,sum;
      n1 = n/100;
      n3 = n%10;
      sum =n1+n3;
      System.out.println(sum);
	}
}