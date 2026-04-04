/**
 * Tehtävä 4 – Rectangle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: width, height.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Muista @Override.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Rectangle extends Shape {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double area(){ 
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        return width * height; 
    }

    @Override
    public String toString(){ 
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        return "Rectangle width: " + width + ", Height: " + height;
    }

    @Override
    public boolean equals(Object o){ 
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        Rectangle other = (Rectangle) o;
        return this.width == other.width && this.height == other.height;
    }
}