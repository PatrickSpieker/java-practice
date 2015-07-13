public class ForScope {
    public static void main(String[] args) {
        outerScope();
    }

    public static void outerScope() {
        int squared = 0;
        for (int i = 1; i <= 12; i++) {
            squared = i * i;
            System.out.println(i + " squared = " + squared);
        }
        System.out.println("The final squared value + 10 is " + (squared+10));
    }
}


