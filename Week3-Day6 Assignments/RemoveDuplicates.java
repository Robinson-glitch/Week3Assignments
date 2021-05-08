package Week3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input ="PayPal India";
		
	
		
		char[] charArray = input.toCharArray();
		
		//Declare a Set as charSet for Character

		Set<Character> charSet=new LinkedHashSet<Character>();
		
		//Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet=new LinkedHashSet<Character>();
		
		for(int i=0;i<charArray.length;i++) {
			
			if(!charSet.contains(charArray[i])) {
				
				charSet.add(charArray[i]);
				if(charArray[i]!=' ') {
					System.out.print(charArray[i]);
				}
				
			}
			
			else {
				
				
				dupCharSet.add(charArray[i]);
				
			}
		}
	
		
	}

}
