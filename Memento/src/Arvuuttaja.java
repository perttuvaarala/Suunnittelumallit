import java.util.Random;

public class Arvuuttaja {
	
	private int raja;
	private Random r;
	private int luku;
	
	
	public Arvuuttaja(int raja) {
		this.raja = raja;
		this.r = new Random();
	}
	
	
	public Object liityPeliin() {
		this.luku = r.nextInt(raja);
		return new Memento(this.luku);
		
	}
	
	public boolean arvaa(Object o, int arvaus) {
	        Memento m = (Memento)o;
	        this.luku = m.getTila();
	        
	        return luku == arvaus;
	 } 
	
	
	 private class Memento {
		private int tallennettavaLuku;
		
		public Memento(int t) {
			this.tallennettavaLuku = t;
		}
		
		public int getTila() {
			return tallennettavaLuku;
		}
		
	}
}
