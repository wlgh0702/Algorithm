import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> runners = new HashMap<>();
        
        for(String runner : participant) {
            runners.put(runner, runners.getOrDefault(runner, 0) + 1);
        }
        
        for(String completer : completion) {
            runners.put(completer, runners.get(completer) - 1);
        }
        
        for(Map.Entry<String, Integer> entry : runners.entrySet()) {
            String key = entry.getKey();
            if(runners.get(key) > 0) {
                return key;
            }
        }
        return "";
    }
}