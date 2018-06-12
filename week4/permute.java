public class Solution {
    
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> numbers) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        permute(result, numbers, 0);
        return result;
    }
    
    private void permute(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> input, int start) {
        if(start >= input.size()) {
            ArrayList<Integer> save = new ArrayList<>();
            save.addAll(input);
            result.add(save);
        }
        for(int j = start; j <= input.size() - 1; j++) {
            swap(input, start, j);
            permute(result, input, start+1);
            swap(input, j, start);
        }
        
    }
    
    private void swap(ArrayList<Integer> input, int a, int b) {
        
            int temp = input.get(a);
            int temp2 = input.get(b);
            input.add(a, temp2);
            input.remove(a+1);
            input.add(b, temp);
            input.remove(b+1);
    }
}
