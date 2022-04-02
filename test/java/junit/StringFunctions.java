package junit;

public class StringFunctions {

	public static boolean ispalindrom(String str) {
		 //str = radar;
		
		
	
		int start = 0;
		int end = str.length()-1 ;
		while(start<end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
		start++;
		end--;
		}
		return true;
	}
	
}
