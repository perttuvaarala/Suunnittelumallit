
public class Näytönohjain implements Osa {

	@Override
	public void lisaaOsa(Osa osa) {
		throw new RuntimeException ("Osaa ei voi lisätä"); 

	}

	@Override
	public int getHinta() {
		return 400;
	}

}
