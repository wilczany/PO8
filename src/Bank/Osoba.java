package Bank;

import java.util.Random;

public class Osoba extends Klient {
    private String imie;
    private String nazwisko;
    private String pesel;
//konstruktor tylko dla tworzenia losowych klientow
    protected Osoba() {
        imie=nazwisko=pesel=" ";
        Random r = new Random();
        dodajKonto(new Konto("0"));
        getKonta().get(0).wplac(r.nextInt(1, 10000));
    }

    public Osoba(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String toString() {
        return this.getClass().getName() + ":\t"
                + "Imie:" + imie + '\t' + "nazwisko:" + nazwisko + '\t' + "PESEL:" + pesel
                + '\n' + super.toString();
    }
}
