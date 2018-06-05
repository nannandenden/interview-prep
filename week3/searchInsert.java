public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {

        return searchInsert(a, 0, a.size()-1, b);
    }

    private int searchInsert(ArrayList<Integer> a, int start, int end, int b) {
        if(start <= end) {
            int center = (start + end)/2;
            if(a.get(center) == b) return center;
            if(a.get(center) > b) {
                return searchInsert(a, start, center-1, b);
            } else {
                return searchInsert(a, center + 1, end, b);
            }
        }
        return end + 1;
    }
}
