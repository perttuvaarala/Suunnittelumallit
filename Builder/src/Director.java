
public class Director {
	
	private BurgerBuilder builder;
	
	public void setBurgerBuilder(BurgerBuilder bb) {
		builder = bb;
	}
	
	public IBurger getBurger() {
		return builder.getBurger();
	}
	
	public void constructBurger() {
		builder.createNewBurger();
		builder.buildBuns();
		builder.buildPatty();
		builder.buildSauce();
	}

}
