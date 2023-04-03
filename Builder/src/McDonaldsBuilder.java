
public class McDonaldsBuilder extends BurgerBuilder {

	@Override
	public void createNewBurger() {
		burger = new StringBurger();
	}

	@Override
	public void buildBuns() {
		burger.setBuns("buns");
	}

	@Override
	public void buildPatty() {
		burger.setPatty("chicken");
	}

	@Override
	public void buildSauce() {
		burger.setSauce("secret sauce");
	}


}
