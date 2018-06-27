public class Solution {
    
    public int fibsum(int A) {
        ArrayList<Integer> fibList = new ArrayList();
        fibList.add(1); // start with only 1 
        int k = 2;
        int index = 1;
        while(k<=A){
            fibList.add(k);
            k = k+fibList.get(index-1);
            index++;
           
        }
        int ans = 0;
        for(int i=fibList.size()-1;i>=0;i--){
               if(fibList.get(i)<=A){
                    A-=fibList.get(i);
                    ans++;
               }
            }
        return ans;
        
    }
    
    
}