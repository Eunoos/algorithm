import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if (cacheSize == 0) return cities.length * 5;   //예외처리

        Deque<String> cache = new LinkedList<>();
        Set<String> cacheSet = new HashSet<>();

        for (String city : cities) {
            city = city.toLowerCase();
            if (cacheSet.contains(city)) {
                cache.remove(city);
                cache.addLast(city);    // 가장 최근으로 이동
                answer += 1;
            } 
            else {
                if (cache.size() == cacheSize) {
                    String removed = cache.pollFirst();  // 가장 오래된 것 제거
                    cacheSet.remove(removed);
                }
                cache.addLast(city);
                cacheSet.add(city);
                answer += 5;
            }
        }

        return answer;
    }
}
