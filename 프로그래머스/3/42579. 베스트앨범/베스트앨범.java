import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르 별 총 재생횟수
        Map<String, Integer> genresPlayCount = new HashMap<>();
        // 장르 별 노래 리스트
        Map<String, List<Song>> genresSong = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++) {
            genresPlayCount.put(genres[i], genresPlayCount.getOrDefault(genres[i], 0) + plays[i]);
            genresSong.computeIfAbsent(genres[i], s -> new ArrayList<>()).add(new Song(i, plays[i]));
        }
        
        List<String> sortedGenre = new ArrayList<>(genresPlayCount.keySet());
        sortedGenre.sort((a, b) -> genresPlayCount.get(b) - genresPlayCount.get(a));
        
        List<Integer> result = new ArrayList<>();
        for(String genre : sortedGenre) {
            List<Song> songs = genresSong.get(genre);
            songs.sort((a, b) -> b.playCount == a.playCount? a.index - b.index : b.playCount - a.playCount);
            
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                result.add(songs.get(i).index);
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}

class Song {
    int index;
    int playCount;
    
    Song(int index, int playCount) {
        this.index = index;
        this.playCount = playCount;
    }
}