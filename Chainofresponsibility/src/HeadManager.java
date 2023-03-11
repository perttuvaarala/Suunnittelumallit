
public class HeadManager extends Handler {

	@Override
	public void handleRequest(RaiseRequest request) {
		if (request.getPercentage() < 5) {
			System.out.println("HeadManager approves " + request.getPercentage() + "% raise");
		} else {
			super.successor.handleRequest(request);
		}
	}

}
