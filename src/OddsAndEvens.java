/*
* Created by Nakolah Daniel Oladidi.
* */

import java.util.*;

public class OddsAndEvens {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("Lets play a game called \"Odds and Even\" ");
    game();
  }

  // Getting the name and side on which to play
  public static void game() {
    Scanner input = new Scanner(System.in);

    System.out.print("What is your name? ");
    String name = input.nextLine();

    // greeting the user
    System.out.printf("Hi %s, which do you choose? (O)dds or (E)vens? ", name);
    String choice = input.next();

    // If statements to distinguish the choices
    if (choice.equals("O")) {
      System.out.printf("%s has picked Odds. The computer will be Evens. ", name);
    } else {
      System.out.printf("%s has picked Evens. The computer will be Odds. ", name);
    }
    spacing();

    // Choosing the number of fingers.
    Random rand = new Random();

    System.out.print("How many \"fingers\" do you put out? ");
    int user = input.nextInt();

    // The computer choosing the "fingers"
    int computer = rand.nextInt(6);
    System.out.printf("The computer has played %d \"fingers\".", computer);
    spacing();

    // Determining the winner
    int sum = user + computer;
    System.out.println(user + " + " + computer + " = " + sum);

    // Distinguishing if it odd or even and determining the winner.
    boolean oddOrEven = sum % 2 == 0;

    // Determination of the winner
    if (oddOrEven == true) {
      System.out.printf("%d is ...even. %n", sum);
      if (choice.equals("E")) {
        System.out.println("You won!");
      } else {
        System.out.println("The computer beat you.");
      }
    } else {
      System.out.printf("%d is ...odd. %n", sum);
      if (choice.equals("O")) {
        System.out.println("You won!");
      } else {
        System.out.println("The computer won.");
      }
    }
  }

  // Adding the many dashes to separate parts
  public static void spacing() {
    System.out.println();
    System.out.println();
    System.out.println("--------------------------------------------------------");
    System.out.println();
    System.out.println();
  }

}
