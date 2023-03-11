
public class Main {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		HeadManager headManager = new HeadManager();
		CEO ceo = new CEO();
		
		manager.setSuccessor(headManager);
		headManager.setSuccessor(ceo);
		
		RaiseRequest r = new RaiseRequest(2);
		manager.handleRequest(r);
		
		r.setPercentage(4);
		manager.handleRequest(r);
		
		r.setPercentage(10);
		manager.handleRequest(r);
	}

}
