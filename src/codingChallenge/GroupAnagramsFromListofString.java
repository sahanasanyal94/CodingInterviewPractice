package codingChallenge;

import java.util.Arrays;

public class GroupAnagramsFromListofString {
	
	public static void main(String[] args) {
		//System.out.print("Hi");
		String[] stringArray =  {"silent","hello","goodbye","listen","ellho"};
		for(int i=0;i<stringArray.length;i++) {
			char[] a = stringArray[i].toCharArray();
			Arrays.sort(a);
			for(int j=i+1;j<stringArray.length;j++) {
				char[] b = stringArray[j].toCharArray();
				Arrays.sort(b);
				if(Arrays.equals(a,b)) {
					System.out.println(stringArray[i]+" and "+stringArray[j]+" are Anagrams");
				}else {
					System.out.println(stringArray[i]+" and "+stringArray[j]+" are Not Anagrams");
				}
			}
			
		}
	}
	
}
