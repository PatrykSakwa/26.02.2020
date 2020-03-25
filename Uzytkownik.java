
package wypozyczalnia;
import java.util.Date;

public class Uzytkownik {
    private String nazwisko;
    private String imie;
    private String miejsceZamieszkania; 
    private int wiek;
    boolean blokada=false ; 
    boolean wszystkoOplacone;
    
    public Uzytkownik(String naz,String im, String miejsce, int wi, boolean oplaty){
        nazwisko=naz;
        imie=im;
        miejsceZamieszkania=miejsce;
        wiek=wi;
        wszystkoOplacone=oplaty;
    }
    
    public boolean czyZablokowac() {
    if (wszystkoOplacone == false){
        blokada = true;
        return true;
            }
    else {
        return false;
    }
}
    
}
