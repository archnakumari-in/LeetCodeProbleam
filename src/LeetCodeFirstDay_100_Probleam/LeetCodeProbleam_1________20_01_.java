package LeetCodeFirstDay_100_Probleam;

public class LeetCodeProbleam_1________20_01_ {
	

	    public boolean isPalindrome(int x) {
	        if (x < 0) {
	            return false;
	        }

	        int n = x;
	        int revNum = 0;

	        while (n > 0) {
	            int d = n % 10;
	            revNum = revNum * 10 + d;
	            n = n / 10;
	        }

	        return revNum == x;
	    }

	    public static void main(String[] args) {
	    	LeetCodeProbleam_1________20_01_ obj = new LeetCodeProbleam_1________20_01_();

	        int number = 121;  
	        boolean result = obj.isPalindrome(number);

	        System.out.println("Is Palindrome: " + result);
	    }
	}



