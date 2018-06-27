import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Queue;

class Graph {
    public static void main(String args[]) {
        String start = "hit";
        String end = "cog";
        ArrayList<String> dict = new ArrayList<>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");
        int shortest = ladderLength(start, end, dict);
        System.out.println("The shortest path from " + start + " to " + end + " is " + shortest);
    }

    public static int ladderLength(String start, String end, ArrayList<String> dict) {
        if(isOneWordDiff(start, end)) return 2;
        Queue<LevelAndGraph> queue = new LinkedList<>();
        LevelAndGraph st = new LevelAndGraph(0, start);
        queue.add(st);
        while(!queue.isEmpty()) {
            LevelAndGraph current = queue.remove();
            int nextLevel = current.level + 1;
            if(nextLevel >= dict.size()) return 0;
            String word = current.word;
            for(String item: dict) {
                if(isOneWordDiff(item, word)) {
                    if(isOneWordDiff(item, end)) return nextLevel + 1;
                    queue.add(new LevelAndGraph(nextLevel, item));
                }
            }
        }
        return 0;
    }
    
    static boolean isOneWordDiff(String a, String b) {
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

    static ThreeNode 
}