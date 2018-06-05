public class Solution {
	public int sqrt(int a) {
	    if(a == 0 || a == 1) return a;
	    
	    int st = 0;
	    int end = a/2;
	    int ans = 0;
	    while(st <= end) {
	        System.out.println("st: " + st + "\tend: " + end);
	        int mid = (st + end) / 2;
	        
	        if(mid*mid == a) return mid;
	        
	        if(mid*mid < a){
	            st = mid + 1;
	            ans = mid;
	        } else {
	            end = mid - 1;
	        }
	    }
	    return ans;
	}
	

}
