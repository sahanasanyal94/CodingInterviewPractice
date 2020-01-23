package codingChallenge;

public class ArmstrongNoList {
	
	public static void main(String[] args) {
		
		for(int i = 1; i<=500;i++) {
			checkArmstrongNumber(i);
		}
	}

	private static void checkArmstrongNumber(int n) {
		
		int rem=0;
		int sum=0;
		int temp = n;
		while(n>0) {
			rem=n%10;
			sum = sum+rem*rem*rem;
			n=n/10;
		}
		if(sum==temp)
			System.out.println(temp+" is an Armstrong Number");
		else
			System.out.println(temp+" is not an Armstrong Number");
	}
}
