package codingTest_programmers_pac;

import java.util.*;

public class 카카오_오픈_채팅방 {
	
	public String[] solution(String[] record) {
		
		
		HashMap<String,String> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		
		for(String rec : record) {
			String[] str_list = rec.split(" ");
			
			if (str_list[0].equals("Enter")) {
				map.put(str_list[1], str_list[2]);
				list.add(str_list[1] + "님이 들어왔습니다.");
				
			}else if(str_list[0].equals("Change")) {
				map.put(str_list[1], str_list[2]);
			}else {
				list.add(str_list[1] + "님이 나갔습니다.");
			}
		}
		
		String[] answer = new String[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
		
			int idx = list.get(i).indexOf("님");
		
			String id = list.get(i).substring(0, idx);
			String etc = list.get(i).substring(idx);
		
			answer[i] = map.get(id) + etc;
		
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
