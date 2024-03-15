import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника:");
        double length = scanner.nextDouble();

        System.out.println("Введите ширину прямоугольника:");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        System.out.println("Периметр прямоугольника: " + perimeter);
        System.out.println("Площадь прямоугольника: " + area);
        System.out.println("Длина диагонали прямоугольника: " + diagonal);

        scanner.close();
    }
}
