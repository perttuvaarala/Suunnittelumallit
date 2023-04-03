
public class Main {

	public static void main(String[] args) {
		BurgerBuilder mcdonalds = new McDonaldsBuilder();
		BurgerBuilder hesburger = new HesburgerBuilder();
		
		Director director = new Director();
		
		director.setBurgerBuilder(mcdonalds);
		director.constructBurger();
		
		StringBurger mcBurger = (StringBurger)director.getBurger();
		System.out.println("Mäkin burgeri:\n" + mcBurger.getBurgerIngredients());
		
		director.setBurgerBuilder(hesburger);
		director.constructBurger();
		
		ListBurger heseBurger = (ListBurger)director.getBurger();
		System.out.println("Hesen bökö:");
		
		heseBurger.getBurgerParts().forEach(System.out::println);
	}

}
