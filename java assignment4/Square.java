package assignment4;
import java.util.Scanner;
public class Square {
	
	public static void main(String args[]){
        int num;
        int square;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        try{
        	num = sc.nextInt();
        	if( num >=0){
              square = num * num;
              System.out.println(" square of number is  "+square);	 
        	} 
        
    }catch (Exception e){
    	System.out.println(e.getMessage());

    }

	}
}

