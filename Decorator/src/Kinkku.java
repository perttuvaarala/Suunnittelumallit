
public class Kinkku extends PizzaDecorator{

	private int hinta = 4;
	
	public Kinkku(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
    @Override
    public String getKuvaus() {
        return super.getKuvaus() + " kinkku";
    }

    @Override
    public int getHinta() {
        return super.getHinta() + hinta;
}
}
