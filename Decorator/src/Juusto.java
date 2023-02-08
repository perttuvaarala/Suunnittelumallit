
public class Juusto extends PizzaDecorator{
	
	private int hinta = 2;

	public Juusto(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}

    @Override
    public String getKuvaus() {
        return super.getKuvaus() + "juusto";
    }

    @Override
    public int getHinta() {
        return super.getHinta() + hinta;
}
}
