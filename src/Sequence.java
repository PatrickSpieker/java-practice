//Completed with no multiplication signs!

public class Sequence {
    public static void main(String[] args) {
        int diff = 3;
        int num = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num);
            num += diff;
            diff += 2;
        }
    }
}
