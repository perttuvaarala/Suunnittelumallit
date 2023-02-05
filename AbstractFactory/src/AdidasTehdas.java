
public class AdidasTehdas implements AbstractFactory {

	@Override
	public Farkut luoFarkut() {
		return new AdidasFarkut();
	}

	@Override
	public Tpaita luoTpaita() {
		return new AdidasTpaita();
	}

	@Override
	public Lippis luoLippis() {
		return new AdidasLippis();
	}

	@Override
	public Kengat luoKengat() {
		return new AdidasKengat();
	}

}
