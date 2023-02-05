
public class Main {

	public static void main(String[] args) {
		
		Vaatteet jasperinVaatteet = new Vaatteet(new AdidasTehdas());
		System.out.println(jasperinVaatteet);
		
		jasperinVaatteet.vaihda(new BossTehdas());
		System.out.println(jasperinVaatteet);
		
	}

}
