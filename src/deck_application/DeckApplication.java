package deck_application;

import deck_of_cards.Deck;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: DeckApplication
 * Language: Java
 * Date: 12/8/17
 * Description: This program tests the functionality of the deck of cards.
 */

// This program tests the functionality of the deck of cards
public class DeckApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program
	public static void main(String [] args) 
	{
		// Instantiate the deck of cards
		Deck deckOfCards = new Deck();
		
		System.out.println("***************************************** Deck of Cards: *******************************************");
		
		// Print out the contents of the deck unsorted
		System.out.println("******************************************************************************************");
		System.out.println("Unsorted Deck of Cards: ");
		System.out.println("******************************************************************************************");
		deckOfCards.print();
		System.out.println();
		
		// Sort the deck in order by rank and suit 
		System.out.println("******************************************************************************************");
		System.out.println("Sorted Deck of Cards: ");
		System.out.println("******************************************************************************************");
		deckOfCards.sort();
		
		// Print out the contents of the sorted deck
		deckOfCards.print();
		System.out.println("*********************************************************************************************\n");
	} 
// ------------------- End Main Method -------------------
} // End of class DeckApplication
