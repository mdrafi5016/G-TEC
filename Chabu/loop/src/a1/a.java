package a1;
import java.util.*;
class a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter  numbers you want : ");
        int totalInputs = sc.nextInt();
 int count = 0;
while (count < totalInputs) {
            System.out.print("Enter number " + (count +1) + ": ");
            int number = sc.nextInt();		
            System.out.println("You entered: " + number);
            count++;
            if (number == 18) {
    			System.out.println("you can vote");
    		}
    		else if (number >= 19) {
    			System.out.println("your already eligible for vote");
    		}
    		else {
    				System.out.println("your not eligible for vote");
        }
    }
}
}



