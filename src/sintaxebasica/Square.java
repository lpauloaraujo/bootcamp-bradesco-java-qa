package sintaxebasica;

import java.util.Scanner;

public class Square {
    public void calculateSquareArea () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the side of the square: ");
        var sideLength = scanner.nextFloat();
        System.out.printf("Area of the square: %s\n", getAreaBySideLength(sideLength));
    }

    private float getAreaBySideLength (float sideLength) {
        return sideLength * sideLength;
    }
}
