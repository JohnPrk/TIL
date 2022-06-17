package 예제.ch2;

public class ByteOverflow {

    public static void main(String[] args) {

        byte b = 0;
        int i = 0;

        for (int x = 0; x < 270; x++) {
            b ++;
            i ++;

            System.out.println(b + "\t" + i);

        }
    }
}
