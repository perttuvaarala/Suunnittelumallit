
public class Manager extends Handler {

	@Override
	public void handleRequest(RaiseRequest request) {
		if (request.getPercentage() < 3) {
			System.out.println("Manager approves " + request.getPercentage() + "% raise");
		} else if (super.successor != null) {
			super.successor.handleRequest(request);
		}
		
	}

}
