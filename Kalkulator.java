import greenfoot.*;
import java.awt.Point;
import java.awt.Font;

public class Kalkulator extends World {
    
        
    Wyswietlacz wyswietlaczKalk;
    
    public Kalkulator() {     
        super(400, 600, 1);  
        wyswietlaczKalk = new Wyswietlacz(new Point(240, 20), "0.0", new Font("Helvetica", Font.PLAIN, 20));
        addObject(wyswietlaczKalk, 170, 230);   
                           
        PrzyciskNumeryczny zero = new PrzyciskNumeryczny("0", new Point(60, 60));                        
        PrzyciskNumeryczny jeden = new PrzyciskNumeryczny("1", new Point(60, 60));                
        PrzyciskNumeryczny dwa = new PrzyciskNumeryczny("2", new Point(60, 60));
        PrzyciskNumeryczny trzy = new PrzyciskNumeryczny("3", new Point(60, 60));
        PrzyciskNumeryczny cztery = new PrzyciskNumeryczny("4", new Point(60, 60));
        PrzyciskNumeryczny piec = new PrzyciskNumeryczny("5", new Point(60, 60));
        PrzyciskNumeryczny szesc = new PrzyciskNumeryczny("6", new Point(60, 60));
        PrzyciskNumeryczny siedem = new PrzyciskNumeryczny("7", new Point(60, 60));
        PrzyciskNumeryczny osiem = new PrzyciskNumeryczny("8", new Point(60, 60));
        PrzyciskNumeryczny dziewiec = new PrzyciskNumeryczny("9", new Point(60, 60));                        
        addObject(zero, 80, 460);
        addObject(jeden, 80, 400);
        addObject(dwa, 140, 400);
        addObject(trzy, 200, 400);
        addObject(cztery, 80, 340);
        addObject(piec, 140, 340);    
        addObject(szesc, 200, 340);  
        addObject(siedem, 80, 280);
        addObject(osiem, 140, 280);    
        addObject(dziewiec, 200, 280);   
        
        PrzyciskFunkcyjny plus = new PrzyciskFunkcyjny("+", new Point(60, 60));
        PrzyciskFunkcyjny minus = new PrzyciskFunkcyjny("-", new Point(60, 60));
        PrzyciskFunkcyjny rownaSie = new PrzyciskFunkcyjny("=", new Point(60, 60));
        PrzyciskFunkcyjny czysc = new PrzyciskFunkcyjny("c", new Point(60, 60));        
        addObject(plus, 260, 340);
        addObject(minus, 260, 280);
        addObject(rownaSie, 260, 400);
        addObject(czysc, 140, 460);        
    }       
}
