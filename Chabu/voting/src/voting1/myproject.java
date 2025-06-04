package voting1;
import java.util.*;
class myproject{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age =");
		int age=sc.nextInt();
		if (age == 18) {
			System.out.println("you can vote");
		}
		else if (age >= 19) {
			System.out.println("your already eligible for vote");
		}
		else {
				System.out.println("your not eligible for vote");
			}
		}	
	}
