package me.parkri123.labs.rps;

/*
 * @author: Pardhav Polavarapu
 * @dateCreated: 10/18/17
 * @dueDate: 10/23/17
 * @purpose: Use methods to make a game of rock, paper, scissors
 * @Methods: main, game
 */
public class RPSGame {
    //initialize all variables
    private int compChoice;
    private static int compScore;
    private int userChoice;
    private static int userScore;
    private static int tieScore;

    //Default Constructor
    public RPSGame() {
        compChoice = (int) (Math.random() * 3)+ 1;
    }
    //Parameterized constructor
    public RPSGame(int compchoice, int compscore, int userchoice, int userscore) {
        this.compChoice = compchoice;
        this.compScore = compscore;
        this.userChoice = userchoice;
        this.userScore = userscore;
    }
    //Parameterized constructor
    public RPSGame(int userchoice) {
        this.compChoice = (int) ((Math.random() * 3)+ 1);
        this.userChoice = userchoice;
    }

    //Accessor, Getters, Setters
    public int getCompChoice() {
        return compChoice;
    }

    public void setCompChoice(int compChoice) {
        this.compChoice = compChoice;
    }

    public int getCompScore() {
        return compScore;
    }

    public void setCompScore(int compScore) {
        this.compScore = compScore;
    }

    public int getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }
    public static int getTieScore() {
        return tieScore;
    }

    public static void setTieScore(int tieScore) {
        RPSGame.tieScore = tieScore;
    }
    //game method
    /*
     * Name: game
     * Purpose: Compare User and computer choice
     * Input: none
     * Return: none
     */
    public void playGame() {
        //If the user chooses Rock
        if (getUserChoice() == 1) {
            if (compChoice == 1) {
                System.out.println("It's a tie");
                System.out.println("You chose: Rock              Computer chose: Rock");
                setTieScore(getTieScore()+1);
            }
            else if (compChoice == 2) {
                System.out.println("You lost!");
                System.out.println("You chose: Rock              Computer chose: Paper");
                setCompScore(getCompScore() + 1);
            }
            else if (compChoice == 3) {
                System.out.println("You won!");
                System.out.println("You chose: Rock              Computer chose: Scissors");
                setUserScore(getUserScore() + 1);
            }
        }
        //If User chooses Paper
        if (getUserChoice() == 2) {
            if (compChoice == 1) {
                System.out.println("You won!");
                System.out.println("You chose: Paper              Computer chose: Rock");
                setUserScore(getUserScore() + 1);
            }
            else if (compChoice == 2) {
                System.out.println("It's a tie");
                System.out.println("You chose: Paper              Computer chose: Paper");
                setTieScore(getTieScore()+1);
            }
            else if (compChoice == 3) {
                System.out.println("You lost");
                System.out.println("You chose: Paper              Computer chose: Scissors");
                setCompScore(getCompScore() + 1);
            }
        }
        //If user chooses scissors
        if (getUserChoice() == 3){
            if (compChoice == 1) {
                System.out.println("You lost");
                System.out.println("You chose: Scissors              Computer chose: Rock");
                setCompScore(getCompScore() + 1);
            }
            else if (compChoice == 2) {
                System.out.println("You won!");
                System.out.println("You chose: Scissors              Computer chose: Paper");
                setUserScore(getUserScore() + 1);
            }
            else if (compChoice == 3) {
                System.out.println("It's a tie");
                System.out.println("You chose: Scissors              Computer chose: Scissors");
                setTieScore(getTieScore()+1);
            }
        }
        //Print how many games user won
        System.out.println("Your score: " + getUserScore() + "        Computer score: " + getCompScore());

    }//end method game
}//end class