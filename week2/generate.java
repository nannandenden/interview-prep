public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            ArrayList<Integer> needRow = null;
            if (i > 0) {
                 needRow = result.get(i - 1);
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    newRow.add(1);
                } else {
                    int left = needRow.get(j-1) == null ? 0 : needRow.get(j-1);
                    int right = needRow.get(j) == null ? 0 : needRow.get(j);
                    newRow.add(left + right);
                }
            }
            result.add(newRow);
        }
        return result;
	}
}
