package pl.coderslab.controller;

import java.util.Scanner;

public class UserGroupController {


    static void startManagingUsers(){

        int action = choseAction();

        switch (action){
            case 0: MainController.startMainMenu(); break;
            case 1: addUser(); break;
        }

    }


    static private void addUser(){

        System.out.println("Starting to add user group");
        //Scan data for user group to add


        //Call to UserGroupService to method to add user group
//        UserGroupService.add(userGroup)

    }

    private static void printAll(){
        System.out.println("Printion all user groups");

        startManagingUsers();
    }

    private static int choseAction(){

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("What you want to do with User Groups:");
            System.out.println("1 - Add");
            System.out.println("2 - Edit");
            System.out.println("3 - Delete");
            System.out.println("4 - List all");
            System.out.println("0 - Main menu");

            try{
                int option = scan.nextInt();
                if(option < 0 || option > 4){
                    throw new Exception("Wrong value");
                }
                return option;
            }catch (Exception e){
                System.out.println("Wrong value");
                scan.next();
            }

        }

    }

}
