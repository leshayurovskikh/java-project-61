package hexlet.code;

public class Utils {

        public static int getRandomint(int min, int max){
            double a = (int) ( min + Math.random () * max);
            return (int) a;
        }
}
