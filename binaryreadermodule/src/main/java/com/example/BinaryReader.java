package com.example;

public class BinaryReader {
    public static void main(String[] args){
        System.out.println("Week 5 Critical Thinking Exercise: Reading Binary\nBy: Nestor (Felix) Sotres" +
                "\n9/21/15\n\nThis program will prompt the user for a string of 0's and 1's (binary) and " +
                "translate them into a regular numbering system. The scope of the numbers is 0-10.\n");

        ReaderControl run = new ReaderControl();
        run.runProgram();
    }
}
