import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new ArrayDeque<>();
        
        for(int i = 0; i < priorities.length; i++) {
            queue.add(new Process(i, priorities[i]));
        }
        
        int answer = 0;
        while(!queue.isEmpty()) {
            Process current = queue.poll();
            
            if(hasHigherPriority(queue, current)) {
                queue.add(current);
            } else {
                answer++;
                if(current.location == location) {
                    break;
                }
            }
        }
        
        return answer;
    }
    
    private boolean hasHigherPriority(Queue<Process> queue, Process current) {
        for(Process process : queue) {
            if(process.priority > current.priority) {
                return true;
            }
        }
        return false;
    }
    
    class Process {
        private final int location;
        private final int priority;
        
        public Process(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }
}