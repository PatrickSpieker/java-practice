public class Position {
    public static void main(String[] args) {
        double s;
        double t = 5.0;
        double v0 = 4.0;
        double s0 = 2.0; 
        double a = 6.0;
        s = s0 + v0*t + (1/2)*a*t*t;
        System.out.println(s);
    }
}

