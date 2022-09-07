package 프로그래머스;

import java.util.*;

public class KAKAO_BLIND_RECRUITMENT_캐시 {
	public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        String[] cache = new String[cacheSize];
        for(String city : cities) {
            city = city.toLowerCase();
            if(cacheSize == 0) {
            	return cities.length * 5; 	
            }
            int idx = -1;
    
            for(int j=0; j<cache.length; j++) {
                if(city.equals(cache[j])) {
                    idx = j;
                    break;
                } 
            }
            if(idx == -1) {
                for(int k=cacheSize-1; k >=1; k--) {
                    cache[k] = cache[k-1];
                }
                cache[0] = city;
                answer += 5;
            }else {
                for(int l=idx; l >=1; l--) {
                    cache[l] = cache[l-1];
                }
                cache[0] = city;
                answer += 1;
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		KAKAO_BLIND_RECRUITMENT_캐시 T = new KAKAO_BLIND_RECRUITMENT_캐시();
		
		T.solution(0,  new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
	}
}
