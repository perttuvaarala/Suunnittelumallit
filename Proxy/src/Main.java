import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		 	List<Image> list = new ArrayList<>();
	        list.add(new ProxyImage("Kuva1"));
	        list.add(new ProxyImage("Kuva2"));
	        list.add(new ProxyImage("Kuva3"));


	        System.out.println("Kansion sisältö:");
	        list.forEach(image -> {
	            image.showData();
	        });

	        System.out.println("Näytetään kuvat:");
	        list.forEach(image -> {
	            image.displayImage();
	        });

	}

}
