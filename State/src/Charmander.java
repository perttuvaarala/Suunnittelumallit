
public class Charmander extends PokemonState {

	@Override
	public void evolve(Pokemon poke) {
		poke.setState(new Charmeleon());
	}

	@Override
	public void tailWhip(Pokemon poke) {
		System.out.println("Charmander uses tailwhip +10xp");
		poke.setExp(10 + poke.getExp());
	}

	@Override
	public void headButt(Pokemon poke) {
		System.out.println("Charmander uses headbutt +10xp");
		poke.setExp(10 + poke.getExp());
		
	}

	@Override
	public void spitFire(Pokemon poke) {
		System.out.println("Charmander uses spitfire +10xp");
		poke.setExp(10 + poke.getExp());
	}

}
