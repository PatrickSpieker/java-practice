public class Zigurat {
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
            for (int i = 1; i <= (5-line); i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*line - 1); j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

