import greenfoot.*;
import java.awt.Point;
import java.awt.Font;

public class Wyswietlacz extends TextBox {          
    double zapamietanaLiczba = 0.0;
    String zapamietanyZnak = "";    
    public Wyswietlacz(Point size, String text, Font font) {
        super(size, text, font);
    }
    
    public void act() {
       super.act();
    }   
    
    public double pobierzLiczbe() {
        String liczba = this.getText();
        return Double.parseDouble(liczba);
    }    
    
    public void zapamietajLiczbe(double liczbaDoZapamietania) {
        zapamietanaLiczba = liczbaDoZapamietania;
    }    
    
     public void zapamietajZnak(String znak) {
        zapamietanyZnak = znak;
    }    
                
    public void wyswietlLiczbe(double nowaLiczba) {
       this.setText(Double.toString(nowaLiczba));
    }      
    
    public void oblicz(double drugaLiczba) {
        if (zapamietanyZnak.equals("+")) {
            wyswietlLiczbe(zapamietanaLiczba + drugaLiczba);            
        } else if (zapamietanyZnak.equals("-")) {
            wyswietlLiczbe(zapamietanaLiczba - drugaLiczba);
        } 
    }
}
