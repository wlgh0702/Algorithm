import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> partMap = new HashMap<>();
        for(String person : participant) {
            partMap.put(person, partMap.getOrDefault(person, 0) + 1);
        }
        for(String person : completion) {
            partMap.put(person, partMap.get(person) - 1);
        }
        
        for(String key : partMap.keySet()) {
            if(partMap.get(key) == 1) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}