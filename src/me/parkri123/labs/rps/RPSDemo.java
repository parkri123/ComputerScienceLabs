package me.parkri123.labs.rps;/*
 * @author: Pardhav Polavarapu
 * @dateCreated:10/18/17
 * @dueDate: 10/23/17
 * @purpose: Play Rock Paper Scissors
 * @Methods: main, game
 */
import java.util.*;
public class RPSDemo {
    /*
     * Name:main
     * Purpose: Let the user choose what they want to use
     * Input: Int
     * Return: none
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare user choice variables
        int choice = 0;
        int gamemode = 0;
        int round = 0;
        //Menu
        System.out.println("Welcome to Rock Paper Scissors");
        System.out.println("\nChoose a game mode\n1) Best of 3\n2) Best of 5\n3) Best of x\n4) Infinite\n5) Quit");
        if (in.hasNextInt()) {
            gamemode = in.nextInt();
            if (gamemode == 3){
                System.out.println("Best of ___");
                round = in.nextInt();
            }
            if (gamemode == 5) {
                choice = 4;
            }
            if (gamemode > 4 || gamemode < 1){
                System.out.println("Invalid number");
                choice = 4;
            }
            while (choice != 4) {
                //RPSGame class
                RPSGame rps = new RPSGame();
                System.out.println("");
                //Menu
                System.out.println("Choose either Rock, Paper, or Scissors and enter its corresponding number\n1) Rock\n2) Paper\n3) Scissors\n4) Quit");
                if (in.hasNextInt()) {
                    choice = in.nextInt();
                    //Make choice UserChoice to be able to do calculations
                    rps.setUserChoice(choice);
                    switch (choice) {
                        case 1:
                        case 2:
                        case 3:
                            //Call method game
                            rps.playGame();
                            //Best of 3 not including tied games
                            if (gamemode == 1 && (rps.getUserScore() + rps.getCompScore() == 3)) {
                                choice = 4;
                                //Print total number of games played including tied games
                                System.out.println("You won " + rps.getUserScore() + " out of " + (rps.getUserScore() + rps.getCompScore() + rps.getTieScore()) + " games.");
                            }
                            //Best of 5 not including tied games
                            if (gamemode == 2 && (rps.getUserScore() + rps.getCompScore() == 5)) {
                                choice = 4;
                                //Print total number of games played including tied games
                                System.out.println("You won " + rps.getUserScore() + " out of " + (rps.getUserScore() + rps.getCompScore()) + " games.");
                            }
                            if (gamemode == 3 && (rps.getUserScore() + rps.getCompScore() == round)) {
                                choice = 4;
                                //Print total number of games played including tied games
                                System.out.println("You won " + rps.getUserScore() + " out of " + (rps.getUserScore() + rps.getCompScore()) + " games.");
                            }
                            break;
                        default:
                            if (choice != 4) {
                                System.out.println("Please enter a valid number");
                            } else {
                                System.out.println("You won " + rps.getUserScore() + " out of " + (rps.getUserScore() + rps.getCompScore() + rps.getTieScore()) + " games.");
                            }
                            break;
                    }
                } else {
                    System.out.println("Invalid Input");
                    break;
                }
            }
            System.out.println("Exiting program...");
        } else {
            System.out.println("Invalid Input");

        }
    }//end main method
}//end class