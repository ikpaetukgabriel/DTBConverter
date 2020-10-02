package com.gabrielikpaetuk;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public StringBuilder DecimalToBinary(long number) {

        ArrayList<Integer> finalList = new ArrayList<>();

        while (true){
            if (number == 0){
                System.out.println("Answer --> " + 0);
                break;
            }
            
            else{
                int result = (int) Math.floorDiv(number, 2);
                int remainder = (int) (number % 2);
                finalList.add(0,remainder);
                number = result;

                if (result == 0){
                    StringBuilder finalAnswer = new StringBuilder();
                    for(int i : finalList){
                        finalAnswer.append(i);
                    }
                    return finalAnswer;

                }
            }

        }

        return null;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome, this is a binary to decimal converter.");
        System.out.print("Would you like to proceed? Enter 1 for yes/ Enter 0 for no: ");
        int response = input.nextInt();

        while (true) {
            if (response != 0 && response != 1){
                System.out.println("Invalid Entry.");
                System.out.print("Would you like to proceed? Enter 1 for yes/ Enter 0 for no: ");
                response = input.nextInt();
            }

            if (response == 1){
                System.out.print("Enter a decimal number to be converted: ");
                long number = input.nextLong();

                Main obj = new Main();
                System.out.println("Answer --> " + obj.DecimalToBinary(number));

                System.out.print("Would you like to proceed? Enter 1 for yes/ Enter 0 for no: ");
                response = input.nextInt();

            } else if (response == 0) {
                System.out.print("Goodbye!!!");
                break;
            }
        }
    }
}
