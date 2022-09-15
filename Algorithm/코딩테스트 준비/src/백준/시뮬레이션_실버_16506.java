package 백준;
import java.util.*;

public class 시뮬레이션_실버_16506 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashMap<String, String> hash = new HashMap<>();
		int num = scn.nextInt();
		int cnt =0;
		hash.put("ADD", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt))) + "00");
		hash.put("ADDC", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt++))) + "10");
		hash.put("SUB", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt))) + "00");
		hash.put("SUBC", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt++))) + "10");
		hash.put("MOV", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt))) + "00");
		hash.put("MOVC", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt++))) + "10");
		hash.put("AND", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt))) + "00");
		hash.put("ANDC", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt++))) + "10");
		hash.put("OR", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt))) + "00");
		hash.put("ORC", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt++))) + "10");
		hash.put("NOT", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt++))) + "00");
		hash.put("MULT", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt))) + "00");
		hash.put("MULTC", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt++))) + "10");
		hash.put("LSFTL", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt))) + "00");
		hash.put("LSFTLC", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt++))) + "10");
		hash.put("LSFTR", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt))) + "00");
		hash.put("LSFTRC", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt++))) + "10");
		hash.put("ASFTR", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt))) + "00");
		hash.put("ASFTRC", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt++))) + "10");
		hash.put("RL", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt))) + "00");
		hash.put("RLC", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt++))) + "10");
		hash.put("RR", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt))) + "00");
		hash.put("RRC", String.format("%04d", Integer.parseInt(Integer.toBinaryString(cnt++))) + "10");
		
		while(num-- >0) {
			boolean zero = false;
			String answer = "";
			String str = hash.get(scn.next());
			if(str.split("")[4].equals("0")) zero = true; 
			answer += str;
			answer += String.format("%03d", Integer.parseInt(Integer.toBinaryString(scn.nextInt())));
			answer += String.format("%03d", Integer.parseInt(Integer.toBinaryString(scn.nextInt())));
			int i = scn.nextInt();
			if(zero) answer += String.format("%03d", Integer.parseInt(Integer.toBinaryString(i))) + "0";
			else answer += String.format("%04d", Integer.parseInt(Integer.toBinaryString(i)));
			
			System.out.println(answer);
		}
	}
}
