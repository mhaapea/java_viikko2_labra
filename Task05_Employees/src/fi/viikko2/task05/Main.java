/**
 * Tehtävä 5 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Employee[] ja laske palkkasumma.
 *  2. Tulosta tiedot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 5: implementoi SalariedEmployee ja HourlyEmployee ennen ajoa.");

        Employee[] employees = new Employee[3];
        employees[0] = new SalariedEmployee("Liisa", 1500);
        employees[1] = new HourlyEmployee("Matti", 12, 100);
        employees[2] = new SalariedEmployee("Aino", 2700);

        double totalPay = 0;
        for (Employee e : employees) {
            totalPay += e.monthlyPay();
        }
        System.out.println("Total pay: " + totalPay);
    }
}