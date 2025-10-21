package sintaxebasica;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Age {

    Scanner scanner = new Scanner(System.in);

    public void ageDifference () {

        System.out.print("Enter the name of the first user: ");
        String firstUserName = scanner.next();
        System.out.print("Enter the year of birth of the first user: ");
        int firstUserAge = calculateAge(scanner.nextInt());

        System.out.print("Enter the name of the second user: ");
        String secondUserName = scanner.next();
        System.out.print("Enter the year of birth of the second user: ");
        int secondUserAge = calculateAge(scanner.nextInt());

        System.out.printf("The age difference between %s and %s is %s years.\n",
                firstUserName, secondUserName, Math.abs(firstUserAge - secondUserAge));

    }

    public void getUserAge () {

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        System.out.printf("Hello, %s! You are %s years old. \n", name, calculateAge(yearOfBirth));

    }

    private int calculateAge (int userYearOfBirth) {

        final int CURRENT_YEAR = OffsetDateTime.now().getYear();
        return CURRENT_YEAR - userYearOfBirth;

    }

}
