package assignment4;

public class ConcatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]  strarr= {"1","2","3","4","5","6"};
	      StringBuilder strBuilder = new StringBuilder();
	      
	      for (int i = 0; i < strarr.length; i++) {
	          strBuilder.append(strarr[i]);
	      }
	      
	      String Concatenate= strBuilder.toString();
	      System.out.println(" concatenate all elements of a string array   "+Concatenate);
		}

		
			


	}


