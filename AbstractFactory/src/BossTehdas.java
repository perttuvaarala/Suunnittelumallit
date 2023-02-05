
public class BossTehdas implements AbstractFactory {

	@Override
	public Farkut luoFarkut() {
		return new BossFarkut();
	}

	@Override
	public Tpaita luoTpaita() {
		return new BossTpaita();
	}

	@Override
	public Lippis luoLippis() {
		return new BossLippis();
	}

	@Override
	public Kengat luoKengat() {
		return new BossKengat();
	}

}
