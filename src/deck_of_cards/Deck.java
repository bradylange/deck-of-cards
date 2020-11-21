package deck_of_cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import card_interface.ICard;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: Deck
 * Language: Java
 * Date: 12/8/17
 * Description: This class contains attributes related to a deck of cards.
 */

// This class contains attributes of a deck of cards
public class Deck 
{
	// Instance variables
	private List <ICard> cards;													// Collection of cards in a deck with interface ICard as the generic 
// ------------------- Default Constructor -------------------
	// Default Constructor
	public Deck() 
	{
		// Instantiate default properties 
		cards = new ArrayList <ICard>();										// Create a new Array List with the generic ICard interface
		
		// Adding cards suit and rank using this nested for loop
		for (ICard.Rank rk: ICard.Rank.values()) 								// For each card rank
		{
			for (ICard.Suit st: ICard.Suit.values()) 							// For each card suit
			{
				Card card = new Card(st, rk);									// Instantiate the card 
				cards.add(card);												// Add the card to the deck
			}
		}
		
		Collections.shuffle(cards);												// Shuffle the cards after they have been added by the nested for loop above
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Sort Method -------------------
	// Method that sorts the cards in the deck
	public void sort() 
	{
		Collections.sort(cards);												// Sort the cards in the deck 
	}
// ------------------- End Sort Method -------------------
	
// ------------------- Print Method -------------------
	// Method that prints all the cards in the deck
	public void print() 
	{
		for (ICard obj: cards)													// For each card in the collection
		{
			System.out.println(obj);											// Print the cards in the deck
		}
	}
// ------------------- End Print Method -------------------
} // End of class Deck
