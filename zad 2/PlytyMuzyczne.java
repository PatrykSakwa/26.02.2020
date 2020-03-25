
package wypozyczalnia;

public class PlytyMuzyczne extends Wspolny {
    public String nosnik;
    public PlytyMuzyczne(int nId,String aut, String wyd, double wycena, String nos){
        super(nId,aut, wyd,  wycena);
        nosnik=nos;
    }
}
