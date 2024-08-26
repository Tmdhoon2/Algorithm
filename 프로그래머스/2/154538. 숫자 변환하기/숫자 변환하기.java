import java.util.*;

class Solution {
    
    private Queue<Element> queue = new LinkedList<>();
    private Set<Integer> set = new HashSet<>();
    
    private int min = -1;
    
    public void bfs(int x, int y, int n) {
        Element element = new Element(x, 0);
        queue.offer(element);
        
        while(!queue.isEmpty()) {
            Element removed = queue.poll();
            if (removed.number == y) {
                if (min == -1) {
                    min = removed.count;
                } else {
                    break;
                }
            }
            if (removed.number * 2 <= y) {
                Element element1 = new Element(removed.number * 2, removed.count + 1);
                if (!set.contains(element1.number)) {
                    queue.add(element1);
                    set.add(element1.number);
                }
            }
            if (removed.number * 3 <= y) {
                Element element2 = new Element(removed.number * 3, removed.count + 1);
                if (!set.contains(element2.number)) {
                    queue.add(element2);
                    set.add(element2.number);
                }
            }
            if (removed.number + n <= y) {
                Element element3 = new Element(removed.number + n, removed.count + 1);
                if (!set.contains(element3.number)) {
                    queue.add(element3);
                    set.add(element3.number);
                }
            }
        }
    }
    
    public int solution(int x, int y, int n) {
        bfs(x, y, n);
        return min;
    }
}

class Element {
    int number;
    int count;
    
    public Element(int number, int count) {
        this.number = number;
        this.count = count;
    }
}
