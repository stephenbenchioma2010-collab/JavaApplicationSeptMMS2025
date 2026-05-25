public class PrimitiveDataType{
	public static void main(String[] args){
		byte MyAge = 30;
		System.out.printf("Miss mercy is %d years old%n",MyAge);
		
		short quantity = 20000; 
		System.out.printf("The quantity of iphones is %,d%n",quantity);
		
		int population = 294848848;
		System.out.printf("The population of nigeria is %,d%n",population);
		
		long worldpopulation = 4744747474747474747L;
		System.out.printf("The world populationis %,d%n",worldpopulation);
		
		float price = 577850.7867F;
		System.out.printf("The price of each iphone per unit is %,.2f%n",price);
		
		double mybalance = 3747282472842.793742;
		System.out.printf("My account balance is %c%,.2f%n",'$',mybalance);
		
		char symbol = '%';
		System.out.printf("There is an increment in the world population by 20.25%c%n",symbol);
		
		boolean isJavaFun = true;
		System.out.printf("Do you love Java? %b",isJavaFun);
	}
}