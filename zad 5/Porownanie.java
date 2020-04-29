package testy;

public class Porownanie {
    int pierwsza;
    int druga;
    public Porownanie(int pierwsza, int druga){
        this.pierwsza=pierwsza;
        this.druga=druga;
    }
    public static boolean test_last_digit(int pierwsza, int druga)
     {
	     return (pierwsza > 100 || druga > 100);
     }
}
