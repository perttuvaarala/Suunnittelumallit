
public class Main {
    
    public static void main(String[] args) {
        
        Clock clock = new Clock(8, 30);
        Clock clone = clock.clone();
        
        System.out.println("Alkuperäinen: " + clock);
        System.out.println("Klooni: " + clone);
        
        clock.changeTime(9, 30);
        clone.changeTime(10, 30);
        
        System.out.println("Alkuperäinen: " + clock);
        System.out.println("Klooni: " + clone);
    }
    
}
