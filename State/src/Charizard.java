
public class Charizard extends PokemonState {

	@Override
	public void evolve(Pokemon poke) {
		System.out.println("Fully evolved");
	}

	@Override
	public void tailWhip(Pokemon poke) {
		System.out.println("Charizard uses tailwhip +10xp");
		poke.setExp(10 + poke.getExp());
		
	}

	@Override
	public void headButt(Pokemon poke) {
		System.out.println("Charizard uses headbutt +10xp");
		poke.setExp(10 + poke.getExp());
		
	}

	@Override
	public void spitFire(Pokemon poke) {
		System.out.println("Charizard uses spitfire +10xp");
		poke.setExp(10 + poke.getExp());
	}
	
	@Override
	public String toString() {
		return "Charizard";
	}

}
