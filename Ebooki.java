
package wypozyczalnia;

public class Ebooki extends Wspolny {
    public String rozszerzenie;
    public Ebooki(int nId,String aut, String wyd, double wyceniana, String rozszerz){
        super(nId,aut, wyd,  wyceniana);
        rozszerzenie=rozszerz;
}}
