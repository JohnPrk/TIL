package 예제.ch3;

public class OperatorEx10 {
    public static void main(String[] args) {

        int a = 1000000; // 1,000,000
        int b = 2000000; // 2,000,000

        long c = a * b;  // 2,000,000,000,000
        long d = (long) a * b;  // 2,000,000,000,000

        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
