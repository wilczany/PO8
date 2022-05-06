package Bank;

public class Konto {
    private String nr;
    private double saldo = 0;
    public Konto(String nazwa){
        nr=nazwa;
    }

    public Double getSaldo() {
        return saldo;
    }
    public String getNr(){
        return nr;
    }
    public void wplac(double kwota){
        saldo+=kwota;
    }
    public void wyplac(double kwota){
        saldo-=kwota;
    }

    public String toString(){
        return "(Numer konta: "+nr+",Saldo: "+saldo+")";
    }
}
