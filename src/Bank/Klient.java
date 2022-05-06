package Bank;

import java.util.ArrayList;
import java.util.List;

public class Klient {
    private List<Konto> konta = new ArrayList<>();

    public void dodajKonto(Konto konto) {
        konta.add(konto);
    }

    public List<Konto> getKonta() {
        return konta;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("{");

        for (Konto k : konta
        ) {
            s.append(k).append(" ");
        }
        s.append("}");
        return s.toString();

    }
}
