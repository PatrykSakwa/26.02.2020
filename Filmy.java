
package wypozyczalnia;

public class Filmy extends Wspolny {
    public int minutyTrwania;
    public Filmy(int nId,String aut, String wyd, double wyceniana, int minuty){
        super(nId,aut, wyd,  wyceniana);
        minutyTrwania=minuty;
    }
}
