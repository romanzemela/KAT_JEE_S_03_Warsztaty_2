package pl.coderslab.controller;

import java.util.Scanner;

public class UserGroupController {
    public static void main(String[] args) {
        int action = chooseAction();
        switch (action) {
            case 1:
                System.out.println("Option 1");
                break;
            case 2:
                System.out.println("Option 1");
                break;
            case 3:
                System.out.println("Option 1");
                break;
            case 4:
                System.out.println("Option 1");
                break;
        }
    }

    public static int chooseAction() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("What you want to do:");
            System.out.println("1 - Add");
            System.out.println("2 - Edit");
            System.out.println("3 - Delete");
            try {
                int option = scan.nextInt();
                if (option < 1 || option > 4) {
                    throw new Exception("Wrong value");
                }
                return option;
            } catch (Exception e) {
                System.out.println("Nie poprawna wartość");
                scan.next();
            }


        }
    }
}
