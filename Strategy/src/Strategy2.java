import java.util.List;

public class Strategy2 implements ListConverter {

	@Override
	public String listToString(List<String> list) {
		
        String[] stringArray = new String[list.size()];
        stringArray = list.toArray(stringArray);
        String s = ""; 
        
        for (int i = 0; i < stringArray.length; i++) {
            if (i % 2 == 0) {
                s += "\n" + stringArray[i];
            } else {
                s += " " + stringArray[i];
            }
        	
        }
        return s; 
	}

}
