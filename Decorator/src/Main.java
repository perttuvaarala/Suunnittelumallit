
public class Main {

	public static void main(String[] args) {

		Pizza salamiPizza = new Salami(new Juusto(new Pohja()));
		Pizza kinkkuPizza = new Kinkku(new Juusto(new Pohja()));
		Pizza pepperoniPizza = new Pepperoni(new Juusto(new Pohja()));
		
		System.out.println(salamiPizza.getKuvaus() + ", hinta: " + salamiPizza.getHinta());
		System.out.println(kinkkuPizza.getKuvaus() + ", hinta: " + kinkkuPizza.getHinta());
		System.out.println(pepperoniPizza.getKuvaus() + ", hinta: " + pepperoniPizza.getHinta());

	}

}
