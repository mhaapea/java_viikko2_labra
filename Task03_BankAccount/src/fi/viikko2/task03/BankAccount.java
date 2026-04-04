/**
 * Tehtävä 3 – BankAccount (kapselointi, konstruktorit, toString, equals)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: accountNumber (String), balance (double).
 *  2. Konstruktori: jos initialBalance < 0 -> nollaa.
 *  3. `deposit(amount)` ja `withdraw(amount)` säännöillä.
 *  4. `toString()` ja `equals(Object)` (tilinumero).
 *
 * VINKIT:
 *  - equals: pelkkä tilinumero riittää; vältä double-vertailua.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task03;

public class BankAccount {

   String accountNumber;
   double balance;

    public BankAccount(String accountNumber, double initialBalance) {

        this.accountNumber = accountNumber;

        if (initialBalance < 0.0) {
            this.balance = 0.0;
        }
        else {
            this.balance = initialBalance;
        }
        }

        double deposit(double amount) {
            balance += amount;
            return balance;
        }
        double withdraw(double amount) {
            if (amount > balance) {
                balance = 0.0;
                return balance;
            } else {
                balance -= amount;
                return balance;
            }
        }
        public double getBalance() {
            return balance;
        }

    @Override
    public String toString(){
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        return String.format("%s: %.2f", this.accountNumber, this.balance);
    }

    @Override
    public boolean equals(Object o){
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        BankAccount other = (BankAccount) o;
        return this.accountNumber.equals(other.accountNumber);
    }
}