class Solution {
    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<ArrayList<Integer>> bottom = new ArrayList<>();
        int min = 1;
        int minCount = 1;

        for(int i = 0; i < A; i++) {
            ArrayList<Integer> line = new ArrayList<>();
            for(int dec = A; dec > min; dec--) {
                line.add(dec);
            }
            for(int mid = 0; mid < minCount; mid++) {
                line.add(min);
            }
            minCount+=2;
            for(int inc = min + 1; inc <= A; inc++) {
                line.add(inc);
            }
            bottom.add(line);
            min++;
        }
        
        for(int d = bottom.size() - 1; d >= 0; d--) {
            result.add(bottom.get(d));
        }

        for(int i = 1; i < bottom.size(); i++) {
            result.add(bottom.get(i));
        }
        
        return result;
    }

}

