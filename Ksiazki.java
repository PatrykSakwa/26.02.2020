
package wypozyczalnia;

public class Ksiazki extends Wspolny {
    public int iloscStron;
    public Ksiazki(int nId,String aut, String wyd, double wyceniana, int strony){
        super(nId,aut, wyd,  wyceniana);
        iloscStron=strony;
    }
    
    
}
