public class Zigurat2 {
    public static void main(String[] args) {
        for (int line = 5; line >= 1; line--) {
            for (int i = 1; i <= (line-1); i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (11-2*line); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

