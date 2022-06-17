package 예제.ch3;

public class OperatorEx12 {
    public static void main(String[] args) {

        int a = 1000000 * 1000000 / 1000000; // 1000000 * 1000000이 먼저 계산되어 int 범위를 넘어감
        int b = 1000000 / 1000000 * 1000000;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = 10;
        int d = 1000000 * 1000000;
        while (true) {
            System.out.println(d);
            d = d / c;
            if(d > -700) {
                break;
            }
        }
    }
}
