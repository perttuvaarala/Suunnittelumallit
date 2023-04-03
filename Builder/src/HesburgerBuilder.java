
public class HesburgerBuilder extends BurgerBuilder {

	@Override
	public void createNewBurger() {
		burger = new ListBurger();
	}

	@Override
	public void buildBuns() {
		burger.setBuns("buns");
	}

	@Override
	public void buildPatty() {
		burger.setPatty("beef");
	}

	@Override
	public void buildSauce() {
		burger.setSauce("ketchup");
	}

}
