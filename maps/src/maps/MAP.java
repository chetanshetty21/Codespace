package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MAP {

	public static void main(String[] args) {
		Map<Integer , String > map=new HashMap<Integer, String>();
		map.put(01, "value");
		map.put(02, "value1");
		map.put(03, "value2");
		map.put(04, "value3");
		Set<Entry<Integer, String>> ref1=map.entrySet();
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(ref1);
		for (Entry<Integer,String > ref : ref1) {
			System.out.println(ref.getKey() +"  helo "+ref.getValue());
			
		}
//		map.forEach(E->System.out);
	}

}
