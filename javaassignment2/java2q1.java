package javaassignment2;
import java.util.Scanner;
public class java2q1 {
	static int fibonacci(int i) {
		if (i <= 1) 
			return i;
		return fibonacci(i - 1) + fibonacci(i - 2);
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the position of Fibonacci number: ");
		int position = scanner.nextInt();

		int fibonacciNumber = fibonacci(position);
		System.out.println("Fibonacci number at position " + position + " is: " + fibonacciNumber);

		scanner.close();
		//second way
		int a,b,c,i;
        a=0;
        b=1;
 	  System.out.print(a+" "+b+" ");
 	  for(i=0;i<25;i++) {
 		  c=a+b;
 		  System.out.print(c+" ");
 		  a=b;
 		  b=c;
 		  //third way
 		 int b1[];
         b1=new int[10];
         b1[0]=0;
         b1[1]=1;
  	  System.out.print(b1[0]+" "+b1[1]+" ");
  	  for(int j=2;j<10;j++) {
  		b1[i]=b1[j-1]+b1[j-2];
  		  System.out.print(b1[j]+" ");
  		
  		  
  	  }
 		  
 	  }
	}
}
