public class TypeCasting{
	public static void main(String[] args){
		double price = 7650;
		System.out.printf("The price of the laptop is %f%n",price);
		
		double balance = 5693.875;
		int convertedBalance = (int)balance;
		System.out.printf("The converted balance is %d%n",convertedBalance);
		
		char symbol = '?';
		int convertedSymbol = (int)symbol;
		System.out.printf("The converted symbol is %d%n",convertedSymbol);
	}
}