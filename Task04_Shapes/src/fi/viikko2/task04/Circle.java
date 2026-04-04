/**
 * Tehtävä 4 – Circle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kenttä radius.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Area = Math.PI * r * r.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){ 
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){ 
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        return String.format("Circle radius: %.2f", radius);
    }

    @Override
    public boolean equals(Object o){ 
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        Circle other = (Circle) o;
        return this.radius == other.radius;
    }
}