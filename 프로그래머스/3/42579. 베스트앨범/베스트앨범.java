import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> playCountMap = new HashMap<>();
        Map<String, List<Integer>> songMap = new HashMap<>();
        for(int i = 0; i < genres.length; i++) {
            playCountMap.put(genres[i], playCountMap.getOrDefault(genres[i], 0) + plays[i]);
            songMap.putIfAbsent(genres[i], new ArrayList<>());
            songMap.get(genres[i]).add(i);
        }

        for(String genre : songMap.keySet()) {
            songMap.get(genre).sort((a, b) -> {
                if(plays[a] == plays[b]) {
                    return Integer.compare(a, b);
                }

                return Integer.compare(plays[b], plays[a]);
            });
        }

        List<String> genreList = new ArrayList<>(playCountMap.keySet());
        genreList.sort((a, b) -> Integer.compare(playCountMap.get(b), playCountMap.get(a)));

        List<Integer> returnList = new ArrayList<>();
        for(String genre : genreList) {
            for(int i = 0; i < Math.min(2, songMap.get(genre).size()); i++) {
                returnList.add(songMap.get(genre).get(i));
            }
        }

        return returnList.stream().mapToInt(Integer::intValue).toArray();
    }
}