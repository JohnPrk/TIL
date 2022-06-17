package 예제.ch3;

public class OperatorEx6 {
    public static void main(String[] args) {

        byte b = 10;
//        byte result = ~b; //'~'연산의 결과가 int라서 byte형 변수에 저장할 수 없다.
        byte result = (byte) ~b;

        System.out.println("b = " + b);
        System.out.println("~b = " + result);
    }
}
