import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
       Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      int n1,n2,sum;
      n1 = n/10;
      n2 = n%10;
      sum =n1+n2;
      System.out.println(sum);
	}
}