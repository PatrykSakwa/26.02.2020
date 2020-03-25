
package wypozyczalnia;

public class Audiobooki extends Wspolny {
    public String format;
    public Audiobooki(int nId,String aut, String wyd, double wycena, String form){
        super(nId,aut, wyd,  wycena);
        format=form;
    }
}
