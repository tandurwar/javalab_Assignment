package assignment4;

public class PalindromeString {
	
	public static boolean isPalindrome(String str) {
        
        str = str.toLowerCase();
        
        
        String reversed = "";
        
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
       
        return str.equals(reversed);
    }
    
    public static void main(String[] args) {
        String input = "abba";
        boolean isPalindrome = isPalindrome(input);
     System.out.println("String "  +input+ " is palindrome " + isPalindrome);
        
    }
}




