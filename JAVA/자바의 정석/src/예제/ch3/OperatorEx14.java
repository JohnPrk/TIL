package 예제.ch3;

public class OperatorEx14 {
    public static void main(String[] args) {

        char c1 = 'a';

        //char c2 = c1 + 1; // error message : incompatible types: possible lossy conversion from int to char
        char c2 = 'a' + 1;

        System.out.println(c2);

    }
}
