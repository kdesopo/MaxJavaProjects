package ui;

import java.util.Scanner;

public class Console {

    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String prompt) {
        boolean isValid = false;
        int i = 0;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                sc.next();  // discard invalid data
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = Console.getInt(prompt);
            if (i < min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i > max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    } 
}