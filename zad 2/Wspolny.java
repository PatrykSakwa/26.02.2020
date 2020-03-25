
package wypozyczalnia;

import java.util.Date;


public class Wspolny {
    protected int numerID;
    protected String autor;
    protected String wydawnictwo;
    protected double Wartosc;
    public Wspolny(){
        numerID=0;
        autor="";
        wydawnictwo="";
        Wartosc=0;
    }
    public Wspolny(int nId,String aut, String wyd, double wycena){
        numerID=nId;
        autor=aut;
        wydawnictwo = wyd;
        Wartosc=wycena;
    }
    
    public static double kara (boolean wypozyczenie, Date dataRozpoczecia){
      double  kara =0;
    if (wypozyczenie==true){
       Date dataObecna = new Date (2020,03,25);
        int ilosc=(int)roznica(dataRozpoczecia,dataObecna);
        if (ilosc>30){
            int dniPonad=ilosc-30;
            kara=dniPonad*0.30;
        } 
        else{
           kara = 0;
                    }
    }
    else { kara = 0; }
    return kara;
    }
     public static long roznica(Date data1, Date data2) 
    {
        long roznica = Math.abs(data1.getTime() - data2.getTime());
        return roznica / ((long) (1000 * 60 * 60 * 24));
    }
}
