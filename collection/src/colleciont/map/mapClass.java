package colleciont.map;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapClass {

	public static void main(String[] args) {
		
		HashMap a = new HashMap();
		Map b = new HashMap();
		
		a.put("one" , new Date());
		a.put(12, "orange");
		a.put(33, 125);
		
		System.out.println(a);
		
		a.put(12, "banana");
		System.out.println(a);
		
		a.put(13,  "banana");
		System.out.println(a);
		
		
		System.out.println(a.get("one"));
		
		a.remove("one");
		System.out.println(a);
		
		HashMap<String, String> hmap = new HashMap<>();
		
		hmap.put("one", "apple");
		hmap.put("two", "grape");
		hmap.put("three", "mango");
		hmap.put("four", "banana");
		hmap.put("five", "orange");
		
		//keySet 활용
		Iterator<String> keyIter = hmap.keySet().iterator();
		
		while(keyIter.hasNext()) {
			
			String key = keyIter.next();
			String value = hmap.get(key);
			
			System.out.println(key + " : " + value);
		}
		
		Collection<String> values = hmap.values();
		Iterator valueIter = values.iterator();
		
		while(valueIter.hasNext()) {
			System.out.print(valueIter.next() + " ");
		}
		
		System.out.println();
		
		Object[] valueArr = values.toArray();
		
		for(Object v : valueArr) {
			System.out.print(v + ", ");
		}
		
		Set<Map.Entry<String,String>> set = hmap.entrySet();
		
		Iterator<Map.Entry<String, String>> entryIter = set.iterator();
		
		while(entryIter.hasNext()) {
			Map.Entry<String, String> entry = entryIter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
				
	}
	
	
	
	
	
}
