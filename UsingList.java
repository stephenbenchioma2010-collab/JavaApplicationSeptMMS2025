import java.util.ArrayList;
import java.util.List;


public class UsingList{
	public static void main(String[] args){
		List<String> cars = new ArrayList<>();
		
		cars.add("Toyota");
		cars.add("BMW");
		cars.add("Ferrari");
		
		cars.set(1,"Dodge");
		
		cars.remove(0);
		
		System.out.println(cars.size());
		
		cars.get(1);
		System.out.printf("%s%n",cars.get(1));
		
		for(String car : cars){
			System.out.println(car);
		}
	}
}