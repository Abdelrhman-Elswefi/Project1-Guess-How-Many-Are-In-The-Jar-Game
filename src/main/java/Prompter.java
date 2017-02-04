import java.util.Scanner;

public class Prompter {
	
	private Jar jar;
	Scanner scanner = new Scanner(System.in);
	
	public void promptForAdminstrator(){
		

		System.out.println("ADMINISTRATOR SETUP\n------------------------");
		System.out.print("What type of item should go in the jar: ");

		String itemName = scanner.nextLine();

		System.out.printf("what is the maximum amount of %s that go in the jar: ", itemName);
		int maxNumber = scanner.nextInt();
		System.out.println("--------------------------\n\n\n\n\n");

		jar = new Jar(itemName, maxNumber);

	}
	
	public void promptForPlayer(){
		
		System.out.println("------------------------------\nWelcome to the guessing game!");
		jar.guessNumber();
		
	}

}
