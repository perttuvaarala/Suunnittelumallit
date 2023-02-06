
public class Main {

	public static void main(String[] args) {
		
		ClockTimer timer = new ClockTimer();
		DigitalClock digiClock = new DigitalClock(timer);
		
		timer.tick();
		timer.tick();
		timer.tick();
	}
}
