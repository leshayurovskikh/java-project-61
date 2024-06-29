package hexlet.code;

public class Engine {
    public static int generateNumber() {
        int x = (int) (Math.random() * 100);
        return x;
    }

    public static int GCD {
        int agcd = Engine.generateNumber();
        int bgcd = Engine.generateNumber();
        public static int gcd ( int agcd, int bgcd){
        while (bgcd != 0) {
            int tmp = agcd % bgcd;
            agcd = bgcd;
            bgcd = tmp;
        }
        return agcd;
    }
    }
}
