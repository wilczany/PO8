package Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {
    private List<Klient> klienci = new ArrayList<>();

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public List<Klient> getKlienci() {
        return klienci;
    }

    public void dodajLosowo(int x) {
        Random r = new Random();
        int rodzaj;
        for (int i = 0; i < x; i++) {
            rodzaj = r.nextInt(1, 4);
            switch (rodzaj) {
                case 1:
                    Klient o = new Osoba();
                    dodajKlienta(o);
                    break;
                case 2:
                    Klient w = new WaznaOsoba();
                    dodajKlienta(w);
                    break;
                case 3:
                    Klient f = new Firma();
                    dodajKlienta(f);
                    break;
                case 4:
                    Klient d = new DuzaFirma();
                    dodajKlienta(d);
                    break;

            }
        }

    }

    //LACZNE SRODKI
    public double SumaryFirmy() {
        double suma = 0;
        for (Klient k : klienci) {
            if (k.getClass() == Firma.class || k.getClass() == DuzaFirma.class) {
                for (Konto account : k.getKonta()) {
                    suma += account.getSaldo();
                }
            }
        }
        return suma;
    }

    public double SumaryOsobyFizyczne() {
        double suma = 0;
        for (Klient k : klienci) {
            if (k.getClass() == Osoba.class || k.getClass() == WaznaOsoba.class) {
                for (Konto account : k.getKonta()) {
                    suma += account.getSaldo();
                }
            }
        }
        return suma;
    }

    public double SumaryVIP() {
        double suma = 0;
        for (Klient k : klienci) {
            if (k.getClass() == DuzaFirma.class || k.getClass() == WaznaOsoba.class) {
                for (Konto account : k.getKonta()) {
                    suma += account.getSaldo();
                }
            }
        }
        return suma;
    }

    public double SumaryZwykleOsoby() {
        double suma = 0;
        for (Klient k : klienci) {
            if (k.getClass() == Osoba.class) {
                for (Konto account : k.getKonta()) {
                    suma += account.getSaldo();
                }
            }
        }
        return suma;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("Bank.Bank:\n");
        for (Klient k : klienci) {
            s.append(k.toString()).append('\n');
        }
        return s.toString();
    }

}
