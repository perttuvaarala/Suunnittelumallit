
public abstract class PizzaDecorator implements Pizza {

	protected Pizza pizzaToBeDecorated;
	int hinta = 0;
	
	public PizzaDecorator (Pizza pizzaToBeDecorated) {
		this.pizzaToBeDecorated = pizzaToBeDecorated;
	}
	
	public String getKuvaus() {	
		return pizzaToBeDecorated.getKuvaus();
	}

	public int getHinta() {
		return pizzaToBeDecorated.getHinta();
	}

}
