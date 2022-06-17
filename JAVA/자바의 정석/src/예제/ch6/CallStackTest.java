package 예제.ch6;

public class CallStackTest {

    public static void main(String[] args) {
        firstMethod();
    }

    private static void firstMethod() {
        secondMethod();
    }

    private static void secondMethod() {
        System.out.println("secondMethod()");
    }
}
