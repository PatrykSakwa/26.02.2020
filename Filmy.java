
package wypozyczalnia;

public class Filmy extends Wspolny {
    public int dlugosc;
    public Filmy(int nId,String aut, String wyd, double wycena, int minuty){
        super(nId,aut, wyd,  wycena);
        dlugosc=minuty;
    }
}
