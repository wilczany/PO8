package Bank;

import java.util.Random;

public class Firma extends Klient{
    private String nazwa;
    private String KRS;
    //konstruktor tylko dla tworzenia losowych klientow
    protected Firma(){
        nazwa=KRS=" ";
        Random r= new Random();
        dodajKonto(new Konto("0"));
        getKonta().get(0).wplac(r.nextInt(1,10000));
    }
    public Firma(String nazwa, String KRS){
        this.nazwa=nazwa;
        this.KRS=KRS;
    }
    public String toString(){
        return this.getClass().getName()+":\t"
                +"Nazwa firmy:"+nazwa+'\t'+"Numer KRS:"+KRS
                +'\n'+super.toString();
    }
}
