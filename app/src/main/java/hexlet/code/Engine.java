package hexlet.code;
import java.util.Random;
public class Engine {
    public static int generateNumber() {
        int x = (int) (Math.random() * 100);
        return x;
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
    }

