public class Solution {
    
    class Node {
        boolean flag;
        int date;
        public Node(int date, boolean flag) {
            this.date = date;
            this.flag = flag;
        }
        
    } 
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        ArrayList<Node> rooms = new ArrayList<>();
        for(int i = 0; i < arrive.size(); i++) {
            rooms.add(new Node(arrive.get(i), true));
        }
        for(int j = 0; j < depart.size(); j++) {
            rooms.add(new Node(depart.get(j), false));
        }
        Collections.sort(rooms, new Comparator<Node>(){
            public int compare(Node X, Node Y){
                if(X.date<=Y.date) return -1; // Dont sort
                return 1;
            }
        });
        int currentRoom = 0;
        int i = 0;
        int j = 0;
        while(i < rooms.size()) {
            // calculating the same day differences 
            while(j < rooms.size() && rooms.get(i) == rooms.get(j)) {
                if(rooms.get(j).flag) currentRoom++;
                else currentRoom--;
                j++;
            }
            i = j;
            if(currentRoom > K) return false;
        }
        return true;
    }
    
    
}

