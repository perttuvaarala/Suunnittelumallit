
public class Caretaker {

	private Object o;
	
	public void liityPeliin(Arvuuttaja a){
	this.o = a.liityPeliin();
	}
	
	public boolean arvaa(Arvuuttaja a, int arvaus) {
        return a.arvaa(this.o, arvaus);
    }
}
