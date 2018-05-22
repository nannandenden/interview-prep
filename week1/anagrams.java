public class Solution {
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<String> sortedList = new ArrayList<>();
        // sort all the item in the list
        for (String item : a) {
            char[] currentChar = item.toCharArray();
            Arrays.sort(currentChar);
            sortedList.add(new String(currentChar));
        }
        Set<String> uniqueStr = new HashSet<>();
        for (int i = 0; i < sortedList.size(); i++) {
            String currentStr = sortedList.get(i);
            ArrayList<Integer> currentIndex = new ArrayList<>();
            currentIndex.add(i + 1);
            if (!uniqueStr.contains(currentStr)) {
                uniqueStr.add(currentStr);
                for (int j = i + 1; j < sortedList.size(); j++) {
                    if (currentStr.equals(sortedList.get(j))) {
                        currentIndex.add(j + 1);
                    }
                }
                result.add(currentIndex);
            }

        }
        return result;
	}
}
