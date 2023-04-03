import java.util.ArrayList;
import java.util.List;

public class ListBurger implements IBurger {
	
	private List<String> ingredients;
	
	public ListBurger() {
		this.ingredients = new ArrayList<>();
	}

	@Override
	public void setPatty(String patty) {
		ingredients.add(new Patty(patty).getPatty());
	}

	@Override
	public void setBuns(String buns) {
		ingredients.add(new Buns(buns).getBuns());
	}

	@Override
	public void setSauce(String sauce) {
		ingredients.add(new Sauce(sauce).getSauce());
	}
	
	public List<String> getBurgerParts(){
		return ingredients;
	}

}
