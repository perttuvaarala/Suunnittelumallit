
public class Main {

	public static void main(String[] args) {
	
		Osa muisti = new Muistipiiri();
		Osa emo = new Emolevy();
		Osa prossu = new Prosessori();
		Osa verkkokortti = new Verkkokortti();
		Osa näyttis = new Näytönohjain();
		Osa koppa = new Kotelo();
		
		emo.lisaaOsa(prossu);
		emo.lisaaOsa(näyttis);
		emo.lisaaOsa(verkkokortti);
		emo.lisaaOsa(muisti);
		
		koppa.lisaaOsa(emo);
		
		System.out.println("Osien hinta yht: " + koppa.getHinta());
	}

}
