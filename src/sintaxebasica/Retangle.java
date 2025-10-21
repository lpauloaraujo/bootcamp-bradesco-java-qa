package sintaxebasica;

import java.util.Scanner;

public class Retangle {
    public void calculateRetangleArea () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the base of the retangle: ");
        float baseLenght = scanner.nextFloat();
        System.out.print("Enther the height of the retangle: ");
        float height = scanner.nextFloat();
        float area =calculateArea(baseLenght, height);
        System.out.printf("Area of the retangle: %s", area);
    }

    private float calculateArea (float baseLenght, float height) {
        return baseLenght * height;
    }
}
