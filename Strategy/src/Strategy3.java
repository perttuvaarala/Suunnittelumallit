import java.util.List;

public class Strategy3 implements ListConverter {

	@Override
	public String listToString(List<String> list) {
		
        String s = "";
        
        for (int i = 0; i < list.size(); i++) {
            if (i % 3 == 0) {
                s +=("\n" + list.get(i));
            } else {
                s += (" " + list.get(i));
            }
        }
        
        return s.toString();
	}

}
