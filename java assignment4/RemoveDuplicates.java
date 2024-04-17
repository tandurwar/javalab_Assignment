package assignment4;

public class RemoveDuplicates {
	
	public static  String removeDuplicate(String input){
		StringBuffer sb=new StringBuffer();
		boolean character[]=new boolean[122];
		for(int i=0;i<input.length();i++) {
			
			char test =input.charAt(i);
			if(!character[test]) {
				sb.append(test);
				character[test]=true;
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String input="Hello C-DAC";
		String newString=removeDuplicate(input);
		System.out.println("String after removing duplicates  "+ newString);
	}
		
    
}



