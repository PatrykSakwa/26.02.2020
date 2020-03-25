
package wypozyczalnia;

public class Audiobooki extends Wspolny {
    public String format;
    public Audiobooki(int nId,String aut, String wyd, double wyceniana, String form){
        super(nId,aut, wyd,  wyceniana);
        format=form;
    }
}
