
public class Main {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		s1.addLog("jee");
		s2.addLog("jes");
		
		System.out.println(s1.getLogs() + " " + (s1 == s2));

	}

}
