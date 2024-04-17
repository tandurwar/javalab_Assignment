package assignment4;

import java.util.Scanner;

public class StringException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 String[] strarr =new String[20];
		 System.out.println("enter a number");
		 int n=sc.nextInt();
	        System.out.println("Enter a  string ");
		try {
			for(int i=0;i<n;i++) {
				strarr[i]=sc.next();
				
			}
			System.out.println("nth position of element  "+strarr[n+1]);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}

}
}

