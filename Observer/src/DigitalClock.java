import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer{
	
	private ClockTimer timer;
	
	public DigitalClock(ClockTimer t) {
		this.timer = t;
		t.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o == this.timer) {
			draw();
		}
		
	}
	
    public void draw() {
        System.out.println(timer.getHours() + ":" + timer.getMinutes() + ":" + timer.getSeconds());
    } 

}
