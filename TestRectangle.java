public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5.5);
        rect.setWidth(10.2);

        System.out.printf("Length: %.2f%nWidth: %.2f%n", rect.getLength(), rect.getWidth());
        System.out.printf("Perimeter: %.2f%nArea: %.2f%n", rect.calculatePerimeter(), rect.calculateArea());
    }
}