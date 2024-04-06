package javaassignment2;
import java.util.Scanner;
public class java2q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int originalNumber = n; 

		int result = 0;
		while (n != 0) {
			int pick_last = n % 10;
			result = result + pick_last;
			n = n / 10;
		}

		if (originalNumber % result == 0) 
			System.out.println(originalNumber + " is a Harshad Number");
		else
			System.out.println(originalNumber + " is not a Harshad Number");

		sc.close();
	}
}
