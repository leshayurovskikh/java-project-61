package hexlet.code;
import java.util.Random;
public class Engine {
    public static int generateNumber() {
        return (int) (Math.random() * 100);
    }
    public int agcd = Engine.generateNumber();
    int bgcd = Engine.generateNumber();
   public int getAgcd(int agcd){
       return agcd;
   }

        public static int gcd ( int agcd, int bgcd){
        while (bgcd != 0) {
            int tmp = agcd % bgcd;
            agcd = bgcd;
            bgcd = tmp;
        }
        return agcd;
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

