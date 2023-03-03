import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		 	List<String> lista = new ArrayList<>();
		 	
		 	for (int i = 0; i < 10; i++) {
		 		lista.add("esim" + i);
		 	}
	       
		 	Context context = new Context(new Strategy1());
		 	System.out.println(context.convertList(lista));
        
	        context.setStrategy(new Strategy2());
	        System.out.println(context.convertList(lista));
	        
	        context.setStrategy(new Strategy3());
	        System.out.println(context.convertList(lista));

	}

}
