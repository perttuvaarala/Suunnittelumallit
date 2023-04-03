
public abstract class BurgerBuilder {
	
	protected IBurger burger;
	
	public IBurger getBurger() {
		return burger;
	}
	
	public abstract void createNewBurger();
	public abstract void buildPatty();
	public abstract void buildSauce();
	public abstract void buildBuns();
 

}
