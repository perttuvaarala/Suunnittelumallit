
public class Pokemon {
	
	private int exp;
	private PokemonState currentState;
	
	public Pokemon() {
		currentState = new Charmander();
		exp = 0;
	}
	
	public void setExp(int xp) {
		exp = xp;
		
		if (currentState.toString() != "Charizard") {
			if (exp > 99) {
			currentState.evolve(this);
			exp = 0;
			System.out.println("Evolving to " + currentState.toString());
			}
		}
	}

	public void tailWhip() {
		currentState.tailWhip(this);
	}
	
	public void headButt() {
		currentState.headButt(this);
	}
	
	public void spitFire() {
		currentState.spitFire(this);
	}
	
	public void setState(PokemonState pokeState) {
		currentState = pokeState;
	}

	public int getExp() {
		return exp;
	}
	

}
