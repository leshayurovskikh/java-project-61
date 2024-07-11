package hexlet.code;

public class Utils {
        public static int getRandomint(int min, int max){
            double a = (int) ( min + Math.random () * max);
            return (int) a;
        }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
    public static boolean isSimple(int number) {
        if(number < 2) return false;
        for(int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
