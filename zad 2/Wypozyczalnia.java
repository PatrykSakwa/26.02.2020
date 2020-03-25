
package wypozyczalnia;
import java.util.Date;

public class Wypozyczalnia {

    public static void main(String[] args) {
        Wspolny wsp = new Wspolny(12556, "Coelho", "Jakies wydawnictwo", 125.55); 
        Ksiazki ks = new Ksiazki(1223,"Sienkiewicz","Helios", 50.55, 654);
        System.out.println("Sprawdzam czy dziala 2 ");
        Date dataUzyczenia = new Date (2020,02,1);
        double ileKary=Wspolny.kara(true,dataUzyczenia);
        System.out.println(ileKary);
        Date dataUzyczenia2 = new Date (2020,03,15);
        double ileKary2=Wspolny.kara(true,dataUzyczenia2);
        System.out.println(ileKary2);
        System.out.println("Sprawdzamy zad 3");
        Uzytkownik jan = new Uzytkownik("Jankiewicz","Jan", "Wroclaw, Aleja 15", 25, false);
        System.out.println(jan.czyZablokowac());
        
    }
    
}
