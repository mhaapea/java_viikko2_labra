/**
 * Tehtävä 2 – Metodien ylikuormitus (sum, min, max, taulukot)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Toteuta sum(int,int), sum(int,int,int), sum(int[]), sum(double[]).
 *  2. Toteuta max(int[]) ja min(int[]).
 *
 * VINKIT:
 *  - Käy taulukko silmukalla; varo tyhjiä taulukoita.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task02;

public class MathUtil {

    //1
    int sum(int a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
    public static double sum(double[] arr) {
        double sum = 0.0;
        for (double d : arr) {
            sum += d;
        }
        return sum;
    }
    //2
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if(i > max) {
                max = i;
            }
        } return max;
    }
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if(i < min) {
                min = i;
            }
        } return min;
    }

    public static int placeholderInt(){ return 0; }
    public static double placeholderDouble(){ return 0.0; }
}