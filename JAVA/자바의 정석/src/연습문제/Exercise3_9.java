package 연습문제;

public class Exercise3_9 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = (ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90) || (ch >= 48 && ch <= 57) ? true : false;


        System.out.println("b = " + b);
    }
}
