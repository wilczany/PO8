import Bank.*;

public class Main {

    public static void main(String[] args) {
        Klient kl=new Firma("nazwa","numer");
        Konto ko=new Konto("0");
        Bank pko = new Bank();
        ko.wplac(200);
        kl.dodajKonto(ko);
        pko.dodajKlienta(kl);
        pko.getKlienci().get(0).getKonta().get(0).wplac(30);
        pko.dodajLosowo(5);
        System.out.println(pko);
        System.out.println(pko.SumaryZwykleOsoby());
        System.out.println(pko.SumaryOsobyFizyczne());
        System.out.println(pko.SumaryFirmy());
        System.out.println(pko.SumaryVIP());

    }
}
