package numbersodd;
import java.util.*;
class oddno{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		if (num % 2 == 1) {
			System.out.println("This is Odd Number");
		}
		else
		{
			System.out.println("This is Even Number");
		}
	}
}