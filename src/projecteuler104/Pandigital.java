package projecteuler104;

import java.math.BigInteger;

public class Pandigital {

    CalcFib human = new CalcFib();
    int n = 2;

    public int digit() {
        BigInteger kitty;
        int duck;
        String cat;
        String duckling;
        while (true) {
            duck = human.fibEnd();
            duckling = Integer.toString(duck, 10);
            n++;
            if (n > 2747) {
                if (check(duckling)) {
               /*     kitty = human.fib(n);
                    cat = kitty.toString();
                 */ 
                    kitty = human.get(); 
                    cat = kitty.toString(); 
                    if (check(cat.substring(0, 9))) {
                        break;
                    }
                }
            }

        }
        return n;
    }

    public static boolean check(String first) {
        if (first.contains("1") && first.contains("2") && first.contains("3")
                && first.contains("4") && first.contains("5") && first.contains("6")
                && first.contains("7") && first.contains("8") && first.contains("9")) {
            return true;
        }
        return false;
    }
}
