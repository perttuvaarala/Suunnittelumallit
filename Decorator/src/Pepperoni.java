
public class Pepperoni extends PizzaDecorator{
	
	private int hinta = 3;

	public Pepperoni(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}

    @Override
    public String getKuvaus() {
        return super.getKuvaus() + " pepperoni";
    }

    @Override
    public int getHinta() {
        return super.getHinta() + hinta;
}
}
