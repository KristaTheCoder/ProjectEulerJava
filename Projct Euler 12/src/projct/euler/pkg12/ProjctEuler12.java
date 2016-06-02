/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projct.euler.pkg12;

/**
 *
 * @author kshuc001
 */
public class ProjctEuler12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n = 7;
        double x = 0;
        int numDivisor = 0;

        while (numDivisor < 500) {
            n++;
            x = n * (n + 1) / 2;
            numDivisor = 0;
            double sqrt = Math.floor(Math.sqrt(x));
            for (double v = 1; v <= sqrt; v++) {
                if (x % v == 0) {
                    numDivisor += 2;
                    if (x == v) {
                        numDivisor--;
                    }
                }
            }
        }
        System.out.print(x);

    }
}
