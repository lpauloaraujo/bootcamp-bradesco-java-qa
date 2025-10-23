package sintaxebasica;

import java.util.Scanner;

public class IMC {
    public void imc () {
        String wPrompt = "Enter your weight: ";
        float userWeight = readFloat(wPrompt);
        String hPrompt = "Enter your height: ";
        float userHeight = readFloat(hPrompt);
        float userIMC = calculateIMC(userWeight, userHeight);
        System.out.printf("IMC: %.2f | %s.%n", userIMC, diagnoseIMC(userIMC));
    }

    private float readFloat(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextFloat();
            } catch (Exception e) {
                System.out.println("Invalid value.");
                scanner.nextLine();
            }
        }
    }

    private float calculateIMC (float weight, float height) {
        return weight / (height * height);
    }

    private String diagnoseIMC(float imc) {
        String diagnosis;
        if (imc <= 18.5) diagnosis = "Underweight";
        else if (18.6 <= imc && imc <= 24.9) diagnosis = "Normal weight";
        else if (25.0 <= imc && imc <= 29.9) diagnosis = "Slightly overweight";
        else if (30.0 <= imc && imc <= 34.9) diagnosis = "Obesity Class I";
        else if (35.0 <= imc && imc <= 39.9) diagnosis = "Obesity Class II (Severe)";
        else diagnosis = "Obesity Class III (Morbid)";
        return diagnosis;
    }

}
