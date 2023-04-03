
public class StringBurger implements IBurger {
	
	private StringBuilder ingredients;
	
	public StringBurger() {
		ingredients = new StringBuilder();
	}

	@Override
	public void setPatty(String patty) {
		ingredients.append(patty + "\n");

	}

	@Override
	public void setBuns(String buns) {
		ingredients.append(buns + "\n");

	}

	@Override
	public void setSauce(String sauce) {
		ingredients.append(sauce + "\n");

	}
	
	public String getBurgerIngredients() {
		return ingredients.toString();
	}

}
