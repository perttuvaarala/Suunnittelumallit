
public class Memory {
	
    public void load(long position, byte[] data) { 
        String str = "";
		for(int i = 0; i < data.length; i++) {
			str += data[i];
		}
		System.out.println("Loading data from position: " + position + " Data: " + str);
    }

}
