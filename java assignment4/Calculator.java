package assignment4;
import java.util.Scanner;

public class Calculator {
	int num1;
	int num2;
	protected Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public int add() {
		if(num1<0 ||num2<0) {
			throw new ArithmeticException("both number should be negative........");
		}
		return num1+num2;
		
	}
	
	public int sub() {
		if(num1<0 ||num2<0) {
			throw new ArithmeticException("both number should be negative........");
		}
		return num1-num2;
		
	}

	public int mul() {
		if(num1==0 ||num2==0) {
			throw new ArithmeticException("both number should not be zero........");
		}
		return num1*num2;
		
	}
	
	public double div() {
		if(num2==0) {
			throw new ArithmeticException("denominator should not  be zero........");
		}
		return (double)num1+num2;
		
	}
	public static void main(String[] args) {
		System.out.println("enter the two number ");
		Scanner sc =new Scanner(System.in);
		try {
			String num1=sc.next();
			String num2=sc.next();
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			Calculator obj= new Calculator(n1,n2);
			System.out.println("addition :" +obj.add());
			System.out.println("substraction :" +obj.sub());
			System.out.println("multiplication :" +obj.mul());
			System.out.println("divisob :" +obj.div());
			
		
		}catch(NumberFormatException e) {
			System.out.println("plase provide valid input");
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}





