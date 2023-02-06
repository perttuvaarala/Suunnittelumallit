import java.util.ArrayList;

public class Singleton {
	
	private static Singleton INSTANCE;
	
	  private ArrayList<String> logs;
	  
	  private Singleton() {
	    this.logs = new ArrayList<>();
	  }
	  
	  public static Singleton getInstance() {
	    if (INSTANCE == null) {
	      INSTANCE = new Singleton();
	    }
	    return INSTANCE;
	  }
	  
	  public void addLog(String message) {
	    this.logs.add(message);
	  }
	  
	  public ArrayList<String> getLogs() {
	    return this.logs;
	  }
}

