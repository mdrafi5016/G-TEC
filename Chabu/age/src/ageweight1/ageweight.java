package ageweight1;
import java.util.Scanner;
class ageweight{
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter your age =");
	int age=sc.nextInt();
	System.out.println("Enter your weight =");
	int weight=sc.nextInt();
	if (age >= 18  &&  weight >=50) {
		System.out.println("Eligible");
	}
	else {
		System.out.println("Not Eligible");
	}
	sc.close();	
}
}