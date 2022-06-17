package 예제.ch2;

public class PrecisionTest {
    public static void main(String[] args) {

        float f = 1.2345678901234567890f;
        double d = 1.2345678901234567890;
        float f2 = 0.100000001f;
        double d2 = 0.100000001;
        double d3 = 1.000000000000001;

        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("f2 = " + f2);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
    }

}

