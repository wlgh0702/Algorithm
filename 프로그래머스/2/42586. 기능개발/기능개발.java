import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> remainDays = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++) {
            if((100 - progresses[i]) % speeds[i] > 0) {
                remainDays.add((100 - progresses[i]) / speeds[i] + 1);
            } else {
                remainDays.add((100 - progresses[i]) / speeds[i]);
            }
        }

        int maxDayIndex = 0;
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < remainDays.size(); i++) {
            if(remainDays.get(maxDayIndex) < remainDays.get(i)) {
                result.add(i - maxDayIndex);
                maxDayIndex = i;
            }
        }
        result.add(speeds.length - maxDayIndex);
        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}