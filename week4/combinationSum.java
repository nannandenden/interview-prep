public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> original, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        Collections.sort(original);
        combinationSum(result, current, original, 0, target);
        return result;
    }
    
    private void combinationSum(ArrayList<ArrayList<Integer>> result,
            ArrayList<Integer> current, 
            ArrayList<Integer> original,
            int start,
            int target) {
        if(target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if(target < 0) {
            return;
        }
        
        for(int i = start; i < original.size(); i++) {
            if (i > start && original.get(i) == original.get(i-1)) continue;
            current.add(original.get(i));
            combinationSum(result, current, original, i + 1, target - original.get(i));
            // remove the previouse one that was exceeded the sum
            current.remove(current.size() - 1);
        }
        
    }
}
