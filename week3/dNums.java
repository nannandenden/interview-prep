public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        if(A == null || B == 0) return null;
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> numMap = new HashMap<>();
        int count = 0;
        int removeCount = 0;
        
        for(Integer i : A) {
        		if(numMap.containsKey(i)) {
				int c = numMap.get(i);
				numMap.put(i, c + 1);
			} else {
				numMap.put(i, 1);
			}
        		count++;
        		if(count >= B) {
        			result.add(numMap.size());
            		int r = numMap.get(A.get(removeCount));
            		if(r > 1) {
            			numMap.put(A.get(removeCount), r - 1);
            		} else {
            			numMap.remove(A.get(removeCount));
            		}
            		removeCount++;
        		}
        }
        return result;
    }
}
