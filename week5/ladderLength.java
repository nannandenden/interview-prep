public class Solution {
    public int ladderLength(String start, String end, ArrayList<String> dict) {
        if(start.equals(end)) return 1;
        if(isOneWordDiff(start, end)) return 2;
        Queue<LevelAndGraph> queue = new LinkedList<>();
        LevelAndGraph st = new LevelAndGraph(1, start);
        queue.add(st);
        while(!queue.isEmpty()) {
            LevelAndGraph current = queue.remove();
            int nextLevel = current.level + 1;
            String word = current.word;
            for(int i = 0; i < dict.size(); i++) {
                if(isOneWordDiff(dict.get(i), word)) {
                    if(isOneWordDiff(dict.get(i), end)) return nextLevel + 1;
                    queue.add(new LevelAndGraph(nextLevel, dict.get(i)));
                    dict.remove(i);
                }
            }
        }
        return 0;
    }
    
    boolean isOneWordDiff(String a, String b) {
        if(a.equals(b)) return false;
        int diffCount = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)){
                diffCount++;
                if(diffCount > 1) return false;
            }
        }
        return diffCount == 1;
    }

    class LevelAndGraph {
        int level;
        String word;
        public LevelAndGraph(int l, String w) {
            level = l;
            word = w;
        }
    }
}
