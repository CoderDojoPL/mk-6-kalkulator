import greenfoot.*;
import java.awt.Point;

public class PrzyciskNumeryczny extends PrzyciskKalkulatora {
   
    public PrzyciskNumeryczny(String text, Point size) {
        super(text, size);
    } 
    
    public void act() {   
       super.act(); 
       if (wasClicked()) {           
            String tekstWcisnietaCyfra = this.getText();                        
            double wcisnietaCyfra = Double.parseDouble(tekstWcisnietaCyfra);
            wypiszNaWyswietlacz(wcisnietaCyfra);      
       }
    } 
    
    public void wypiszNaWyswietlacz(double wcisnietaCyfra){
        Kalkulator kalkulator = (Kalkulator) getWorld();
        Wyswietlacz blatWyswietlacz = kalkulator.wyswietlaczKalk;
        String tekstZWyswietlacza = blatWyswietlacz.getText();
        double staraLiczba = Double.parseDouble(tekstZWyswietlacza);
        double nowaLiczba = staraLiczba * 10 + wcisnietaCyfra;
        blatWyswietlacz.wyswietlLiczbe(nowaLiczba);                                      
    }     
    
}