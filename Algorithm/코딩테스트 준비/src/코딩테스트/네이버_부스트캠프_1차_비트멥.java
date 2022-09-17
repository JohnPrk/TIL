package 코딩테스트;
import java.util.*;
public class 네이버_부스트캠프_1차_비트멥 {

	public static void main(String[] args) {
		HashMap<String, String[]> hash = new HashMap<>();
		hash.put("1", new String[] {"08", "18", "08", "08", "08", "08", "08", "1C"});
		hash.put("2",  new String[] {"3C", "42", "81", "02", "1C", "20", "40", "FF"});
		hash.put("3", new String[] {"7E", "81", "02", "1C", "02", "01", "81", "7E"});
		hash.put("4", new String[] {"04", "0C", "14", "24", "44", "84", "FF", "04"});
		hash.put("5", new String[] {"FF", "80", "80", "FC", "02", "01", "81", "7E"});
		hash.put("6", new String[] {"7E", "80", "80", "80", "FE", "81", "81", "7E"});
		hash.put("7", new String[] {"7F", "02", "04", "08", "10", "20", "40", "00"});
		hash.put("8", new String[] {"7E", "81", "81", "7E", "81", "81", "81", "7E"});
		hash.put("9", new String[] {"7E", "81", "81", "81", "FF", "01", "01", "7E"});
		hash.put("0", new String[] {"3C", "42", "81", "81", "81", "81", "42", "3C"});
		hash.put(" ", new String[] {"00", "00", "00", "00", "00", "00", "00", "00"});
		String[] answer = {};
		Scanner scn = new Scanner(System.in);
		String number = scn.nextLine();
		int space_length = 1 + number.length() / 16;
		if(number.length() % 16 == 0)space_length--;
		number = number + (" ".repeat((space_length * 16)-number.length()));
		answer = new String[space_length * 32];
		String[] numbers = number.split("");
		for(int i =0; i < answer.length; i++) answer[i] = "0x";
		for(int a =0; a < numbers.length; a++) {	
			int j = (28 * (a/16)) + a/4;	
			for( String h : hash.get(numbers[a])) {
				answer[j] += h;
				j += 4;
			}
		}
		for(int i=0; i < answer.length; i++) {			
			if(i % 4 == 0) System.out.println();
			System.out.print(answer[i] + " ");
		}
	}
}
