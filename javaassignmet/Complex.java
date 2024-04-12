package javaassignmet;
import java.util.Scanner;
public class Complex {
	int real ,imaganary;
	
	Complex (){
		
	}


	public Complex(int real, int imaganary) {
		super();
		this.real = real;
		this.imaganary = imaganary;
	}
	 
	Complex addComp(Complex C1, Complex C2)
    {
        
        Complex temp = new Complex();
        temp.real = C1.real + C2.real;
        temp.imaganary = C1.imaganary + C2.imaganary;
        return temp;
    }
	
   Complex diffComp(Complex C1, Complex C2)
   {
	   Complex temp = new Complex();
       temp.real = C1.real - C2.real;
       temp.imaganary = C1.imaganary + C2.imaganary;
       return temp;
   }
   
   Complex proComp(Complex C1, Complex C2)
   {
	   Complex temp = new Complex();
       temp.real = C1.real * C2.real;
       temp.imaganary = C1.imaganary + C2.imaganary;
       return temp;
   }
   void printComplexNumber()
   {
       System.out.println("Complex number: " + real + " + " + imaganary + "i");
   }




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		Complex C1 = new Complex(3, 2);
        C1.printComplexNumber();
        Complex C2 = new Complex(9, 5);
        C2.printComplexNumber();
        Complex C3 = new Complex();
        C3 = C3.addComp(C1, C2);
        System.out.print("Sum of ");
        C3.printComplexNumber();
        C3 = C3.diffComp(C1, C2);
        System.out.print("Difference of ");
        C3.printComplexNumber();
        C3 = C3.proComp(C1, C2);
        System.out.print("product of ");
        C3.printComplexNumber();
       
    }
}


