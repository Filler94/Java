import java.util.Scanner;
public class HangmanApplication 
{
	/*
	 * System.out.println("Would you like to play again? Y or N?");
			String answer = input.nextLine();
			answer = answer.toUpperCase();
			if (answer == "Y"){
				continue;
			}else {
				System.exit(0);
			}
	 */
	public static void main(String[] args)
	{
		Hangman game = new Hangman();
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Hangman.");
		System.out.println("I have chosen a mystery word, you have 7 attempts to guess this mystery word in order to win.");	
		
		System.out.println();
		/*TODO make input go to lower case
		 *  
		 */
		
		while(game.getNumberOfGuessesLeft() > 0 && game.isWinner() == false)
		{
			System.out.println("Please select one of the following options" + '\n' +  "1. Guess a letter." + '\n' + "2. Guess the word." +'\n' + "3. Quit.");
			System.out.println("This is the status of your current mystery word." + game.getMysteryWordWithDashes());
			System.out.println("These are your current incorrect letters guessed:" + game.getIncorrectLetters());
			System.out.println("You currently have " + game.getNumberOfGuessesLeft() + " guesses left.");
			int choice = (input.nextInt());
			input.nextLine();
			
			
			//guessing a letter
			if (choice == 1)
			{
				System.out.println("Please enter a letter to guess.");
				String letter = input.nextLine();
				if(game.isCorrectLetter(letter.charAt(0)))
				{
					System.out.println("That is a correct letter");
				} else{
					System.out.println("That is not a correct letter");
				}

			}

			//guessing a word
			else if (choice == 2)
			{
				System.out.println("Please enter a word to guess.");
				String word = input.next();
				
				if (game.isCorrectWord(word))
				{

					System.out.println("Good job. You win!");
				} else
				{

					System.out.println("I'm sorry, that is not the correct word.");
				}
			}
			
			
			//Quitting the game.
			if (choice == 3)
			{
				System.out.println("Thanks for playing.");
				System.exit(0);
			}				
		}	
		
		//
		if (game.getNumberOfGuessesLeft() == 0){
			System.out.println("Sorry, you have run out of guesses.");
		}

	}
}
