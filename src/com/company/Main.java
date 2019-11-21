import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    String gender = "place";
    String lastName = "place";
    String firstName = "place";
    int balance = 100;
    int officeL = 0;
    int office = 2000;
    int officeM = 100;
    int gymL = 0;
    int gym = 0;
    int kitchenL = 0;
    int kitchen = 0;
    int health = 100;
    int strength = 0;
    boolean canbuy = true;
    System.out.println("Welcome back\n");
    System.out.println("If you are new, type NEW as your code.");
    System.out.println("Please Enter Your Code.\n");
    Scanner sc = new Scanner(System.in);
    String code = sc.nextLine();
    if (code.equals("new")){
      System.out.println("Welcome new user!");
      System.out.println("Firstname: \n");
      firstName = sc.nextLine();
      System.out.println("Lastname: \n");
      lastName = sc.nextLine();
      System.out.println("Gender: \n");
      gender = sc.nextLine();
    } else if (code.equals("Tyson")){
      System.out.println("Welcome back Admin");
      firstName = "Tyson";
      lastName = "Watson";
      gender = "Male";
    }
    if (gender.equals("Male")) {
      System.out.println("Welcome back Mr. " + lastName + "\n");
    } else if(gender.equals("Female")){
      System.out.println("Welcome back Mrs. " + lastName + "\n");
    } else if(gender.equals("male")) {
      System.out.println("Welcome back Mr. " + lastName + "\n");
    } else if (gender.equals("female")) {
      System.out.println("Welcome back Mrs. " + lastName + "\n");
    }
    System.out.println("If you need help type: " + "'help'");
    while (true){
      if (officeL == 1){
        office = 1500;
        officeM = 125;
      } else if (officeL == 2){
        office = 1000;
        officeM = 175;
      } else if (officeL == 3){
        office = 250;
        officeM = 250;
      } else if (gymL == 1){
        gym = 5;
      } else if (gymL == 2){
        gym = 10;
      } else if (gymL == 3){
        gym = 25;
      } else if (kitchenL == 1){
        kitchen = 25;
      } else if (kitchenL == 2){
        kitchen = 10;
      } else if (kitchenL == 3){
        kitchen = 5;
      } else if (balance > 0) {
        canbuy = true;
      } else if (balance <= 0){
        canbuy = false;
      } else {
      }
        System.out.println("What can I do for you?");
        String command = sc.nextLine();
      if (command.equals("Food")){
        System.out.println("What should I fix for you?");
        String food = sc.nextLine();
        System.out.println("Ok making " + food + "");
        System.out.println("Ok making " + food + ".");
        System.out.println("Ok making " + food + "..");
        System.out.println("Ok making " + food + "...");
        System.out.println("Ok making " + food + ".....");
        System.out.println("Done making " + food);
        System.out.println("Balance -" + kitchen);
        balance = balance - kitchen;
      } else if (command.equals("Leave")){
        System.out.println("Goodbye");
        System.exit(1);
      } else if(command.equals("Weather")){
        System.out.println("It is Snowing outside. The Temperature is 29 degrees.");
      } else if(command.equals("Joke")){
        System.out.println("Why did  Johnny drop his ice cream?");
        System.out.println("Because he got hit with a bus.");
        System.exit(1);
      } else if (command.equals("Why?")){
        System.out.println("Why anything?");
      } else if (command.equals("Balance")){
        if(firstName.equals("Tyson")){
          System.out.println("Your balance is " + balance + "\n");
        } else if (firstName.equals("Test")){
          System.out.println("Your balance is $1\n");
        }
      } else if (command.equals("Nothing")){
        System.out.println("Oh, ok.");
        System.exit(1);
      } else if (command.equals("Work")) {
        System.out.println("Working");
        try {
            Thread.sleep(office);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Working.");
        try {
            Thread.sleep(office);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Working..");
        try {
            Thread.sleep(office);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Working...");
        try {
            Thread.sleep(office);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Working....");
        try {
            Thread.sleep(office);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done.");
        System.out.println("You made 100 dollars.");
        balance = balance + officeM;
      } else if (command.equals("Buy")){
        System.out.println("If you need help type: " + "'help'");
        while (true){
        System.out.println("What would you like to buy?");
        String buy = sc.nextLine();
        if (buy.equals("help")){
          System.out.println("Buying items costs money based on the item. \n There are many items that range from helping you fight better to work harder and earn more money.\n");
          System.out.println("Gym - Increases Damage \n Kitchen - reduces the cost of food. \n Office - Increases money earned. \n");
        } else if(buy.equals("Gym")){
          System.out.println("What upgrade do you want?\n");
          System.out.println("Level 1 - 5 strength gain. $250 \n");
          System.out.println("Level 2 - 10 strength gain. $500 \n");
          System.out.println("Level 3 - 25 strength gain. $1000 \n");
          String gymB = sc.nextLine();
          if (gymB.equals("1")){
            gymL = 1;
            balance = balance - 250;
            System.out.println("You bought Level 1 Gym!");
          } else if (gymB.equals("2")){
            gymL = 2;
            balance = balance - 500;
            System.out.println("You bought Level 2 Gym!");
          } else if (gymB.equals("3")){
            gymL = 3;
            balance = balance - 1000;
            System.out.println("You bought Level 3 Gym!");
          }

        } else if(buy.equals("Office")){
          System.out.println("Level 1 - Decreases time to 1.5 seconds and makes you $125");
          System.out.println("Level 2 - Decreases time to 1 second and makes you $175");
          System.out.println("Level 3 - Decreases time to .5 seconds and makes you $250");
        } else if (buy.equals("Exit")){
          System.out.println("Exiting...");
          break; 
        }
        }
      } else if (command.equals("Workout")){
        System.out.println("Working out.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Working out..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Working out...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Working out....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done.");
        System.out.println("Strength increased by " + gym);
        strength = strength + gym;
        System.out.println("Your strength is now " + strength);
      } else if (command.equals("Fight")){
        System.out.println("Choose your Opponent. \n");
        System.out.println("<Level 1>: \n Strength")
      }
    }
  }
}
