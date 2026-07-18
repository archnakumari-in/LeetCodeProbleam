package LeetCodeFirstDay;
public class PalindromeLeetCodeProble1 {
	    public static boolean isPalindrome(int x) {
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
	        int number = 121;
	        boolean result = isPalindrome(number);
	        System.out.println(result);
	    } 
	}
