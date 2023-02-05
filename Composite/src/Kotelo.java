import java.util.ArrayList;

public class Kotelo implements Osa {

	ArrayList<Osa> osaLista = new ArrayList<>();
	
	@Override
	public void lisaaOsa(Osa osa) {
		osaLista.add(osa);
	}

	@Override
	public int getHinta() {
        int hinta = 150;
        
        for (Osa osa: osaLista) {
            hinta = hinta + osa.getHinta();
        }
        return hinta;
	}
}
