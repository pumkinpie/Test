import java.util.Scanner;
import java.util.Random;

public class ControlFlow {

	public static void main(String[] args ) {
      Scanner userInput = new Scanner(System.in);
	  System.out.println("Please enter your name.");
	  String firstName = userInput.next();
				
	 System.out.println("Hello"+ firstName);
	 System.out.println("Would you like to continue the interactive portion?");
	 String answer = userInput.next();
	 if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
	 System.out.println("please return later to complete the survey.");
	 System.exit(0);	
	 } else if (answer.equalsIgnoreCase("yes")) {
	 System.out.println("Do you have a red car?");
	 String car = userInput.next();
			      
	 System.out.println("What is the name of your favorite pet?"); 
	 String petName = userInput.next();
	 
	 System.out.println("How old is your favorite pet?");
	 int petAge = userInput.nextInt();
	 
	 System.out.println("What is your lucky number?");
	 int luckyNum = userInput.nextInt();
	 
	 System.out.println("Do you have a favorite quaterback?");
	 String qb = userInput.next();
	 if(qb.equalsIgnoreCase("yes")) {
	 System.out.println("What is their jersey number?");
	 int qbnum = userInput.nextInt();
	 }
	System.out.println("What is the two digit model year of your car?");
	int year = userInput.nextInt();
	
	System.out.println("What is the first name of your favorite actor or actess?");
	String actor =userInput.next();
	
	System.out.println("Enter a random number between 1 and 50");
	int random = userInput.nextInt();
	
	Random Random = new Random();
	int upperbound = 65;
	int rando = petAge + luckyNum;
	int int_Random = Random.nextInt(rando);
	int intRandom0 = Random.nextInt(upperbound);
	int intRandom1 = Random.nextInt(upperbound);
	int intRandom2 = Random.nextInt(upperbound);
	int intRandom3 = Random.nextInt(upperbound);
	int upper = 75;
	int magic = luckyNum * int_Random;
	
	System.out.println("Lottery numbers: " + int_Random + "," + intRandom0 + "," + intRandom1 + "," + intRandom2 + "," + intRandom3);
	System.out.println("Magic Ball: " + magic);
	System.out.println();
	System.out.println("Would you like to answer questions to generate a new set of numbers?");
	String newQuest = userInput.next();
 }
    System.out.println("Thank you for playing!");
 }	
    public static void printNumbers() {
	  ControlFlow.printNumbers();
	  int i;
	  for(i = 0; i >= 47 && i <= 57; i++); {
	    System.out.println("The ControlFlow value of" + (char)i + "=" + i);
	}
 }
    
    public static void printLowerCase() {
      ControlFlow.printLowerCase();
      int a;
      for(a = 0; a >= 97 && a <= 122; a++);
        System.out.println("The ControlFlow value of" + (char)a + "=" + a);
        }
    }

  


