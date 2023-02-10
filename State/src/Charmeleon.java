
public class Charmeleon extends PokemonState {

	@Override
	public void evolve(Pokemon poke) {
		poke.setState(new Charizard());
	}

	@Override
	public void tailWhip(Pokemon poke) {
		System.out.println("Charmeleon uses tailwhip +10xp");
		poke.setExp(10 + poke.getExp());
		
	}

	@Override
	public void headButt(Pokemon poke) {
		System.out.println("Charmeleon uses headbutt +10xp");
		poke.setExp(10 + poke.getExp());
	}

	@Override
	public void spitFire(Pokemon poke) {
		System.out.println("Charmeleon uses spitfire +10xp");
		poke.setExp(10 + poke.getExp());
	}
	
	@Override
	public String toString() {
		return "Charmeleon";
	}

}
