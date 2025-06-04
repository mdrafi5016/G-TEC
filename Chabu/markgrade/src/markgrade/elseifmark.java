package markgrade;
import java.util.*;
class elseifmark{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark");
		int mark=sc.nextInt();
		if(mark<=50) {
			System.out.println("fail");
		}
		else if(mark>50 && mark<=60) {
			System.out.println("D Grade");
		}
		else if(mark>60 && mark<=70) {
			System.out.println("C Grade");
		}
		else if(mark>70 && mark<=80) {
			System.out.println("B Grade");
		}
		else if(mark>80 && mark<=90) {
			System.out.println("A Grade");
		}
		else if(mark>90 && mark<=100) {
			System.out.println("A+ Grade");
		}
		else {
			System.out.println("Invalid");
			
		}
	}
}