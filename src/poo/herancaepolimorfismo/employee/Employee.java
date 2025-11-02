package poo.herancaepolimorfismo.employee;

import java.util.Scanner;

public abstract sealed class Employee permits Attendant, Manager, Salesman {
    private String name;
    private String email;
    private String password;
    private boolean isLoggedIn;
    private final Scanner scanner;

    public Employee (String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isLoggedIn = false;
        this.scanner = new Scanner(System.in);
    }

    public void login () {
        if (this.isLoggedIn) {
            System.out.println("You are already logged in.");
        } else {
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            if (this.email.equals(email) && this.password.equals(password)) {
                this.isLoggedIn = true;
                System.out.println("You have successfully logged in.");
            } else {
                System.out.println("Incorrect email or password.");
            }
        }
    }

    public void logoff () {
        this.isLoggedIn = false;
        System.out.println("You have logged off.");
    }

    public void updateData () {
        System.out.print("Enter the current password: ");
        String password = this.scanner.nextLine();
        if (password.equals(this.password)) {
            System.out.println("You are allowed to update your data.");
            System.out.println();
            System.out.print("Enter your new name: \n");
            String newName = this.scanner.nextLine();
            System.out.print("Enter your new email address: ");
            String newEmail = this.scanner.nextLine();
            this.name = newName;
            this.email = newEmail;
            System.out.println("Your data has been successfully updated!");
        } else {
            System.out.println("Incorrect password.");
        }
    }

    public void updatePassword () {
        System.out.print("Enter the current password: ");
        String password = scanner.nextLine();
        if (password.equals(this.password)) {
            System.out.println("You are allowed to update your password.");
            System.out.print("Enter the new password: ");
            this.password = scanner.nextLine();
            System.out.println("Your password has been successfully updated!");
        } else {
            System.out.println("Incorrect password.");
        }
    }

}
