
public class Clock implements Cloneable {
    
    Hand minuteHand;
    Hand hourHand;
    
    public Clock(int hours, int minutes){
        hourHand = new Hand(hours);
        minuteHand = new Hand(minutes);
    }
    
    public String toString(){
        return "Kello on " + hourHand.getValue() + ":" + minuteHand.getValue();
    }
    
    public void changeTime(int hours, int minutes){
        hourHand = new Hand(hours);
        minuteHand = new Hand(minutes);
    }
    
    @Override
    public Clock clone(){
        Clock c = null;
        try {
            c =(Clock)super.clone();
            c.hourHand = (Hand) hourHand.clone();
            c.minuteHand = (Hand) minuteHand.clone();
        } catch (CloneNotSupportedException e) {
        	e.printStackTrace();
        }
        
        return c;
    }
    
}
