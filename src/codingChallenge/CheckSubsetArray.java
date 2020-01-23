package codingChallenge;


public class CheckSubsetArray
{
	public static void main(String[] args) {
		int arr[] = {1,2,22,13,51,89};
		int arr2[] = {1,13,51,89};
		
		boolean isContain = findSubset(arr,arr2);
		
		if(isContain)
		System.out.println("YES ARRAY 2 IS SUBSET OF ARRAY 1");
		else
		System.out.println("NO ARRAY 2 IS NOT A SUBSET OF ARRAY 1");
		
	}
	
	private static boolean findSubset(int x[], int y[]){
	    
	    int j =0;
	    for(int i = 0; i<y.length;i++){
	        int compValue = y[i];
	        for(j =0; j<x.length; j++){
	            if(compValue == x[j])
	            break;
	        }
	        if(j==x.length)
	        return false;
	    }
	   return true;
	    
	}
}


