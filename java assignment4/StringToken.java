package assignment4;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		StringTokenizer st= new StringTokenizer("Hello C-DAC");
		try {
		String token1=st.nextToken();
		System.out.println(token1);
		String token2=st.nextToken();
		System.out.println(token2);
		String token3=st.nextToken();
		System.out.println(token3);
		}catch(Exception e) {
			System.out.println("there is nothing to Show ");
			System.out.println(e.getMessage());
		}
	}

}



