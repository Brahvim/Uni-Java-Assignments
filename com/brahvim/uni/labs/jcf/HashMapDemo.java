import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] p_args) {
		Map<String, Integer> scores = new HashMap<>();
		
		scores.put("Alice", 95);
		scores.put("Bob", 	97);
		scores.put("Carol", 92);
		scores.put("Alice", 99); // Updates existing value.
		
		System.out.println(scores.get("Alice"));
		System.out.println(scores.containsKey("Bob"));
		
		// Iterate entries:
		for (var e : scores.entrySet()) {
			
			System.out.printf("%s -> %d\n", e.getKey(), e.getValue());
			
		}
	}

}
