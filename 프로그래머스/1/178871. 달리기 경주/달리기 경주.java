import java.util.*;

class Solution {
    
    private ArrayList<String> list = new ArrayList<>();
    private HashMap<String, Integer> indexMap = new HashMap<>();
    
    public ArrayList<String> solution(String[] players, String[] callings) {
        for(int index = 0; index<players.length; index++) {
            String key = players[index];
            list.add(key);
            indexMap.put(key, index);
        }
        
        for(String name: callings) {
            int index = indexMap.get(name);
            list.remove(index);
            list.add(index - 1, name);
            indexMap.put(name, index - 1);
            indexMap.put(list.get(index), index);
        }
        
        return list;
    }
}

class Data {
    String name;
    int index;
    
    public Data(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
