package 프로그래머스;

import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;


class KAKAO_BLIND_RECRUITMENT_신고_결과_받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 1. 중복제거
        HashSet<String> reportSet = new HashSet<>();

        for (String rep : report) {
            reportSet.add(rep);
        }

        // 2. report에서 각 사람이 신고당한 횟수를 countHash으로 정의하기
        HashMap<String, ArrayList<String>> countHash = new HashMap<>();

        for (String rs : reportSet) {
            int indexOf = rs.indexOf(" ");
            String reporter = rs.substring(0, indexOf);
            String reportee = rs.substring(indexOf + 1);

            ArrayList<String> reporteeList = countHash.getOrDefault(reportee, null);
            if(reporteeList == null) {
                reporteeList = new ArrayList<>();
            }
            reporteeList.add(reporter);
            countHash.put(reportee, reporteeList);
        }

        // 3. notifyListHash를 기반으로 reportHash만들기
        HashMap<String, Integer> reportHash = new HashMap<>();
        for (ArrayList<String> notifyList : countHash.values()) {
            if(notifyList.size() >= k) {
                for (String reporter : notifyList) {
                    reportHash.put(reporter, reportHash.getOrDefault(reporter, 0) + 1);
                }
            }
        }


        // 4. reporterHash 정보를 answer에 옮겨담기
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reportHash.getOrDefault(id_list[i], 0);
        }


        return answer;
    }
}