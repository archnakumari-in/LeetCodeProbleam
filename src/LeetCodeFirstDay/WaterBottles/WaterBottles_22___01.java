package LeetCodeFirstDay.WaterBottles;

public class WaterBottles_22___01 {
	
	
	
	    public int numWaterBottles(int numBottles, int numExchange) {
	        int ans = numBottles;

	        while (numBottles >= numExchange) {
	            int changed = numBottles / numExchange;
	            int rem = numBottles % numExchange;
	            ans += changed;
	            numBottles = changed + rem;
	        }
	        return ans;
	    }

	    // MAIN METHOD
	    public static void main(String[] args) {
	    	WaterBottles_22___01 sol = new WaterBottles_22___01();

	        int result = sol.numWaterBottles(9, 3);
	        System.out.println("Total bottles you can drink = " + result);
	    }
	}



