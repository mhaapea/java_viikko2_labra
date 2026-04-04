/**
 * Tehtävä 4 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Shape[] ja laske kokonaispinta-ala.
 *  2. Tulosta toString()-arvot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tehtävä 4: implementoi Rectangle ja Circle ennen ajoa.");

        Rectangle rec = new Rectangle(5.0, 4.0);
        Circle circle = new Circle(3.5);
        
        Shape[] shapes = {rec, circle};
        double totalArea = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        System.out.println("Total area: " + totalArea);

        System.out.println(rec);
        System.out.println(circle);
    }
}