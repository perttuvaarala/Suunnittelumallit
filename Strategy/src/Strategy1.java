import java.util.Iterator;
import java.util.List;

public class Strategy1 implements ListConverter {

	@Override
	public String listToString(List<String> list) {
		
        Iterator<String> i = list.iterator();
        String s = "";
        
        while (i.hasNext()) {
            s += (i.next());
            s += ("\n");
        }
        
        return s.toString();
	}

}
