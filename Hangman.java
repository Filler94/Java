//Kristian Dimitrov

import java.util.Random;
import java.util.Scanner;


public class Hangman 
{

	public int NUMBER_WRONG_GUESSES_ALLOWED = 7;
	private String[] dictionary = {
			"trouble", "copyright", "problem", "form", "problem", "mythical", "discover",
			"consume", "document", "flame", "flow", "chart", "magnetic", "working",
			"predict", "subordinate", "making", "copy", "troublemaking",
			"uncopyrighted", "unmaledictory", "unpredictably"};
	private String mysteryWord;
	private StringBuilder mysteryWordWithDashes;
	private int numberOfIncorrectGuesses;
	private int numberOfCorrectGuesses;

	// TODO give as size to array.
	private char[] incorrectLettersGuessed = new char[7];

	Random random = new Random();
	Scanner input = new Scanner(System.in);


	public Hangman()
	{
		//getting the mystery word at random
		int index = random.nextInt(dictionary.length);
		mysteryWord = dictionary[index];
		mysteryWord.toLowerCase();

		mysteryWordWithDashes = new StringBuilder();
		for (int i = 0; i < mysteryWord.length(); i++) 
		{
			mysteryWordWithDashes.append('-');
		}
	}


	public boolean isCorrectLetter (char letter)
	{
		String let = letter + "";
	
		if (mysteryWord.indexOf(letter) >= 0)
		{
			mysteryWordWithDashes.replace(mysteryWord.indexOf(letter), mysteryWord.indexOf(letter)+1, let);

			return true;
		}
		else 
		{
		
		
			incorrectLettersGuessed[numberOfIncorrectGuesses] = letter;
			numberOfIncorrectGuesses++;
			return false;
		}	
	}


	public boolean isCorrectWord (String word)
	{	

		word.equalsIgnoreCase(mysteryWord);
		if(mysteryWord.equals(word))
		{
			numberOfCorrectGuesses = mysteryWord.length();
			return true;
		}
		else {

			numberOfIncorrectGuesses++;
			return false;
		}
	}

	public String getMysteryWord() {
		return mysteryWord;

	}


	public String getMysteryWordWithDashes(){
		return mysteryWordWithDashes.toString();
	}


	public String getIncorrectLetters() {
		String array;
		array = new String(incorrectLettersGuessed);
		return array;
	}


	public int getNumberOfGuessesLeft() {
		int numberofguessesleft = NUMBER_WRONG_GUESSES_ALLOWED - numberOfIncorrectGuesses;
		return numberofguessesleft;
	}


	public boolean isWinner(){ 
		if (numberOfCorrectGuesses == mysteryWord.length())
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}
