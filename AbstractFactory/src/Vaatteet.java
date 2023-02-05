
public class Vaatteet {
	
	private Farkut farkut;
    private Tpaita tpaita;
    private Lippis lippis;
    private Kengat kengat;    

    public Vaatteet(AbstractFactory vaateTehdas) {
        this.farkut = vaateTehdas.luoFarkut();
        this.tpaita = vaateTehdas.luoTpaita();
        this.lippis = vaateTehdas.luoLippis();
        this.kengat = vaateTehdas.luoKengat();        
    }

    public void vaihda(AbstractFactory vaateTehdas) {
        this.farkut = vaateTehdas.luoFarkut();
        this.tpaita = vaateTehdas.luoTpaita();
        this.lippis = vaateTehdas.luoLippis();
        this.kengat = vaateTehdas.luoKengat();  
    }

    @Override
    public String toString() {
        return "Vaatteet:  farkut=" + farkut + ", tpaita=" + tpaita + ", lippis=" + lippis + ", kengat=" + kengat;
    }

}
