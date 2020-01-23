package codingChallenge;

import java.util.Scanner;
import java.util.*;
public class CheckPatternCount
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		int sequenceLength = sc.nextInt();
		
		if (inputString.isEmpty() || sequenceLength <= 0 || sequenceLength >= inputString.length()) {
            System.out.println("Invalid input");
        } else {
            int i = 0;
            int j = i + sequenceLength;
            Set<String> tempSet = new HashSet<>();
            Map<String, Integer> repeatingSequences = new HashMap<String, Integer>();
            while (j <= inputString.length()) {
                if (!tempSet.add(inputString.substring(i, j))) {
                    repeatingSequences.put(inputString.substring(i,j),repeatingSequences.get(inputString.substring(i,j))+1);
                }else{
                    repeatingSequences.put(inputString.substring(i,j),1);
                }
                i++;
                j = i + sequenceLength;
            }
            for (Map.Entry<String,Integer> map : repeatingSequences.entrySet()) {
                if(map.getValue()>1)
                System.out.println(map.getKey()+" "+map.getValue());
            }

	}
	}
	
	
}