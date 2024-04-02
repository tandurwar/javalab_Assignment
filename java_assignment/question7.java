package assignment;

public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=5,px=5,py=5,c;
		for(r=0;r<=5;r++) {
			for(c=0;c<=10;c++) {
				if(r==5 || px==c || py==c) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
			px--;
			py++;
		}
		
	}

}
