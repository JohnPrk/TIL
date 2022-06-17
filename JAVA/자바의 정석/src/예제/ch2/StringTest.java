package 예제.ch2;

public class StringTest {
    public static void main(String[] args) {
        String a = 7 + " ";
        String b = " " + 7;
        String c = 7 + "";
        String d = "" + 7;
        String e = "" + "";
        String f = 7 + 7 + "";
        String g = "" + 7 + 7;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        System.out.println("--------------일치 여부 체크--------------");
        System.out.println("c == d = " + (c == d));
        System.out.println("c.equals(d) = " + (c.equals(d)));

    }
}
