import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashmapWhileAndFor {

	public static void main(String[] args) {

  
		HashMap<Integer,String> map =new HashMap<Integer, String>();
		map.put(2, "Audvik");
		map.put(14, "Shamal");
		map.put(25, "Amit");
		System.out.println("Using While Loop");
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println("Key is: "+ me.getKey() + "  Value is: "+ me.getValue());
		}
		System.out.println("Using Advance For Loop");
		for(Map.Entry me2 : map.entrySet()) {
			System.out.println("Key is: "+ me2.getKey() + " Value is: "+ me2.getValue());
		}
	}

}
