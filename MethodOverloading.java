import java.util.Scanner;

public class MethodOverloading{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("========Calculate Perimeter Of Shapes=======");
		System.out.println("Enter 1. for Square");
		System.out.println("Enter 2. for Rectangle");
		System.out.println("Enter 3. for Triangle");
		System.out.println("Enter 4. for Exit program");
		
		System.out.print("Enter your choice: ");
		
		int choice = scan.nextInt();
		
		switch(choice){
			case 1:
				System.out.print("Enter the length of the square: ");
				int LenOfSquare = scan.nextInt();
				
				perimeter(LenOfSquare);
			break;
			
			case 2:
				System.out.print("Enter the length of the rectangle: ");
				int LenOfRect = scan.nextInt();
				
				System.out.print("Enter the width of the rectangle: ");
				int WidthOfRect = scan.nextInt();
				
				perimeter(LenOfRect,WidthOfRect);
			break;
			
			case 3:
				System.out.print("Enter the sideA of the triangle: ");
				int SideA = scan.nextInt();
				
				System.out.print("Enter the SideB of the triangle: ");
				int SideB = scan.nextInt();
				
				System.out.print("Enter the SideC of the triangle: ");
				int SideC = scan.nextInt();
				
				perimeter(SideA,SideB,SideC);
			break;
			default:
				System.out.println("Program Exited, Good Bye");
		}
	}
	public static void perimeter(int LenOfSquare){
		int perimeterOfSquare = 4 * LenOfSquare;
		System.out.printf("Perimeter of a square is %d%n",perimeterOfSquare);
	}
	public static void perimeter(int LenOfRect,int WidthOfRect){
		int perimeterOfRect = 2 * (LenOfRect + WidthOfRect);
		System.out.printf("Perimeter of a rectangle is %d%n",perimeterOfRect);
	}
	public static void perimeter(int SideA,int SideB,int SideC){
		int perimeterOfTri = SideA + SideB + SideC;
		System.out.printf("Perimeter of a triangle is %d%n",perimeterOfTri);
	}
}