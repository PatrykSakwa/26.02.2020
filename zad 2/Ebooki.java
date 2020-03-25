
package wypozyczalnia;

public class Ebooki extends Wspolny {
    public String rozszerzenie;
    public Ebooki(int nId,String aut, String wyd, double wycena, String rozszerz){
        super(nId,aut, wyd,  wycena);
        rozszerzenie=rozszerz;
}}
