/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler104;

import java.math.BigInteger;

public class CalcFib {

    //Will be used to store Matrix Values
    private BigInteger a = BigInteger.ONE;
    private BigInteger b = BigInteger.ONE;
    private BigInteger c;
    /*private BigInteger d;

    //Builds Fibonacci Matrix
    private BigInteger[][] answerMatrix = {
        {a, b},
        {c, d}
    };
    */
    // For The fibEnd method
    private int e = 1;
    private int f = 1;
    private int end;

    /**
     * Generates last nine Fibonacci digits
     *
     * @return next Fibonacci number
     */
    public int fibEnd() {
        end = (e + f) % 1000000000;
        e = f;
        f = end;
        
        c = a.add(b); 
        a = b;
        b = c; 
        return end;
    }
    public BigInteger get(){
        return c; 
    }
    /**
     * Used to start the calculation process of the nth (fibNum th) Fibonacci
     * number, and returns the value.
     *
     * @param fibNum - the desired Fibonacci number
     * @return Value of the desired Fibonacci number
     */
 /* public BigInteger fib(int fibNum) {
        a = BigInteger.ONE;
        b = BigInteger.ONE;
        c = BigInteger.ONE;
        d = BigInteger.ZERO;
        answerMatrix[0][0] = a;
        answerMatrix[0][1] = b;
        answerMatrix[1][0] = c;
        answerMatrix[1][1] = d;
        if (fibNum <= 2) {
            return BigInteger.ONE;
        } else {
            makeAnswerMatrix(answerMatrix, fibNum - 1);
            return a;
        }
    }
*/
    /**
     * This is a recursive helper method to multiply the matrix faster by
     * breaking it into smaller problems. Instead of multiplying by the same
     * matrix n times, it cuts the time by seeing which matrices get the same
     * result by squaring. This is what makes the problem O(logN).
     *
     * @param matrix - the current Fibonacci matrix for calculating the
     * Fibonacci number.
     * @param n - How many remaining times to multiply the matrix.
     */
  /*  public void makeAnswerMatrix(BigInteger[][] matrix, int n) {
        if (n < 2) {
            return;
        }
        makeAnswerMatrix(answerMatrix, n / 2);
        MultiplyMatrix();
        if (n % 2 == 1) {
            d = c;
            c = a;
            b = a;
            a = a.add(d);
        }
    }
*/
    /**
     * Preforms and saves the multiplication of matrices to get the Fibonacci
     * answerMatrix.
     */
   /* public void MultiplyMatrix() {
        answerMatrix[0][0] = a;
        answerMatrix[0][1] = b;
        answerMatrix[1][0] = c;
        answerMatrix[1][1] = d;

        a = answerMatrix[0][0].multiply(answerMatrix[0][0]).add(answerMatrix[0][1].multiply(answerMatrix[1][0]));
        b = answerMatrix[0][0].multiply(answerMatrix[0][1]).add(answerMatrix[0][1].multiply(answerMatrix[1][1]));
        c = answerMatrix[1][0].multiply(answerMatrix[0][0]).add(answerMatrix[1][1].multiply(answerMatrix[1][0]));
        d = answerMatrix[1][0].multiply(answerMatrix[0][1]).add(answerMatrix[1][1].multiply(answerMatrix[1][1]));

        answerMatrix[0][0] = a;
        answerMatrix[0][1] = b;
        answerMatrix[1][0] = c;
        answerMatrix[1][1] = d;
    } */

}
