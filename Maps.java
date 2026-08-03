import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps{
	public static void main(String[] args){
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101,"Frank John");
		map.put(102,"Henry Clinton");
		map.put(103,"Kate Benson");
		map.put(104,"Lucy Gerry");
		map.put(105,"Johnny Victor");
		map.put(106,"Kate Benson");
		map.put(107,"nathan zoe");
		
		String value = map.get(102);
		System.out.println("value for 102: " + value);
		
		map.remove(106);
		
		boolean hasName = map.containsKey(106);
		System.out.println("Contains 106: " + hasName);
		
		Set<Integer> keys = map.keySet();
		System.out.println("Keys in map: " + keys);
		
	}
}