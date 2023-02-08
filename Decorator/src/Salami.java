
public class Salami extends PizzaDecorator{

	private int hinta = 2;
	
	public Salami(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}

	@Override
    public String getKuvaus() {
        return super.getKuvaus() + " salami";
    }

    @Override
    public int getHinta() {
        return super.getHinta() + hinta;
}
}
