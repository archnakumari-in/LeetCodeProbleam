package LeetCodeFirstDay_100_Probleam;

public class LeetCode_QuestionNo_2_____29_01 {
	
//	class Solution {
//	    public boolean isPowerOfTwo(int x) {
//	      if(x==0){
//	          return false;
//	      }
//
//	      while(x%2==0){
//	          x = x/2 ;
//	      }
//
//	      if(x==1){
//	          return true ;
//	      }else{
//	          return false;
//	      }
//	    }
//	}
///
///public boolean isPowerOfTwo(int x){
///if(x==0){
///return false;
///}
///while(x%2==0){
///x=x/2;
///}
///if(x==1){
///x=x/2;
///}
///if(x==1){
///return true;
///else{
///return false;
///}
///}
///}
///
///
///
///
///
///class Solution {
//    public boolean isPowerOfTwo(int x) {
//      if(x==0){
//          return false;
//      }
//
//      while(x%2==0){
//          x = x/2 ;
//      }
//
//      if(x==1){
//          return true ;
//      }else{
//          return false;
//      }
//    }
//}
//	
//	
//	
//}
	
	
	
	
	
	
	//public class Main {
	    public static void main(String[] args) {

	        Solution s = new Solution();

	        int n = 8;   // yaha value change karke test karo
	        boolean result = s.isPowerOfTwo(n);

	        System.out.println(result);
	    }
	}

	class Solution {
	    public boolean isPowerOfTwo(int n) {
	        if (n == 0) {
	            return false;
	        }

	        while (n % 2 == 0) {
	            n = n / 2;
	        }

	        return n == 1;
	    }
	}

