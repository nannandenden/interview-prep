class Solution {

	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
		int[] A = new int[a.size()];
		for(int h = 0; h < a.size(); h++) {
			A[h] = a.get(h);
		}
		
		ArrayList<ArrayList<Integer>> results = new ArrayList<>();
		permute(A, 0, results);
		return results;
	}
	
	private void permute(int[] A, int start, ArrayList<ArrayList<Integer>> results) {
		if(start >= A.length) {
			ArrayList<Integer> list = convertArrayToList(A);
			results.add(list);
		}
		
		for(int i = start; i <= A.length - 1; i++) {
			if(checkNoDuplicate(A, start, i)) {
				swap(A, start, i);
				permute(A, start + 1, results);
				swap(A, start, i);
			}
		}
	}
	
	private boolean checkNoDuplicate(int[] a, int start, int end) {
		for(int i = start; i <= end - 1; i++) {
			if(a[i] == a[end]) return false;
		}
		return true;
	}
	
    private void swap(int[] a, int i, int j) {
    		int temp = a[i];
    		a[i] = a[j];
    		a[j] = temp;
    }
	
	private ArrayList<Integer> convertArrayToList(int[] a) {
		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			result.add(a[i]);
		}
		return result;
	}
}