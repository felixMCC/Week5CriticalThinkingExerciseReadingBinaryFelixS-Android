package com.example;
import java.util.*;

/**
 * Created by Felix on 9/21/15.
 */
public class ReaderControl {

    //Global variables
    Scanner input = new Scanner(System.in);         //used to gather input from user
    String userInput = "";                          //holds user input
    HashMap <String, String> binaryDictionary = new HashMap();  //holds our binary values

    public void runProgram(){

        buildDictionary();          //initialize dictionary


        //main program loop
        do{

            printToUser("Please enter a binary number from 0 - 10\n");

            receiveInput();
            printToUser(verifyInput(userInput));

        }while(tryAgain());

        printToUser("Thank you for using this program. Goodbye!");
        System.exit(0); //end program
    }

    private void buildDictionary(){
        binaryDictionary.put("0", "0");
        binaryDictionary.put("1", "1");
        binaryDictionary.put("10", "2");
        binaryDictionary.put("11", "3");
        binaryDictionary.put("100", "4");
        binaryDictionary.put("101", "5");
        binaryDictionary.put("110", "6");
        binaryDictionary.put("111", "7");
        binaryDictionary.put("1000", "8");
        binaryDictionary.put("1001", "9");
        binaryDictionary.put("1010", "10");
    }
    private void printToUser(String string){
        System.out.println(string);
    }

    private void receiveInput(){
        userInput = input.next();
        //printToUser(userInput);       //echo of user input
    }

    private String verifyInput(String input){
        if(binaryDictionary.containsKey(input)){
            return binaryDictionary.get(input);
        }else{
            return "Invalid entry. Please make sure to input a binary number from 1-10.";
        }
    }

    //ask user if they want to try again
    private boolean tryAgain(){
        printToUser("Try again?\n Y/N");
        receiveInput();
        if( userInput.equalsIgnoreCase("Y")){
            return true;
        }else{
            return false;
        }
    }
}
