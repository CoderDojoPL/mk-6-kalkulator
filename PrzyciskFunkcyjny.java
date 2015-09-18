import greenfoot.*;
import java.awt.Point;

public class PrzyciskFunkcyjny extends PrzyciskKalkulatora {
   
    public PrzyciskFunkcyjny(String text, Point size) {
        super(text, size);
    } 
    
     public void act() {   
       super.act(); 
       if (wasClicked()) {
            Kalkulator kalkulator = (Kalkulator) getWorld();
            Wyswietlacz blatWyswietlacza = kalkulator.wyswietlaczKalk;
           
            String wcisnietaZnak = this.getText();
            if (wcisnietaZnak.equals("+") || wcisnietaZnak.equals("-") ) {
                blatWyswietlacza.zapamietajZnak(wcisnietaZnak);        
                double aktualnaLiczba = blatWyswietlacza.pobierzLiczbe();
                blatWyswietlacza.zapamietajLiczbe(aktualnaLiczba);
                blatWyswietlacza.wyswietlLiczbe(0.0);
            } else if (wcisnietaZnak.equals("=")) {
                blatWyswietlacza.oblicz(blatWyswietlacza.pobierzLiczbe());
            } else if (wcisnietaZnak.equals("c")) {
                blatWyswietlacza.wyswietlLiczbe(0.0);  
                blatWyswietlacza.zapamietajZnak(""); 
                blatWyswietlacza.zapamietajLiczbe(0.0);
            }          
       }
    }  
    
}
