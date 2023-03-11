
public class CEO extends Handler {

	@Override
	public void handleRequest(RaiseRequest request) {
			System.out.println("CEO approves " + request.getPercentage() + "% raise");
		
	}

}
