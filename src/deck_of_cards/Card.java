package deck_of_cards;

import card_interface.ICard;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: Card
 * Language: Java
 * Date: 12/8/17
 * Description: This class contains attributes related to a card in a deck and algorithms to modify the attributes.
 */

// This class contains attributes related to a playing card and implement ICard that defines the cards data
public class Card implements ICard 
{
	// Instance variables
	private Suit suit;												// Card's suit
	private Rank rank;												// Card's rank
// ------------------- Default Constructor -------------------
	// Default Constructor
	public Card() 
	{
		// Instantiate default properties
		suit = null;
		rank = null;
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Suit, Rank
	public Card(Suit suit, Rank rank) 
	{
		// Instantiate properties with parameter values 
		this.suit  = suit;
		this.rank = rank;
	}
// ------------------- End Alternate Constructor -------------------

// Setters:
// ------------------- Set Suit Method -------------------
	// Method that alters the card's suit
	public void setSuit(Suit suit) 
	{
		this.suit = suit;											// Alter the card's suit
	}
// ------------------- End Set Suit Method -------------------

// ------------------- Set Rank Method -------------------
	// Method that alters the card's rank
	public void setRank(Rank rank) 
	{
		this.rank = rank;											// Alter the card's suit
	}
// ------------------- End Set Rank Method -------------------
	
// Getters:
// ------------------- Get Suit Method -------------------
	// Method that returns the card's suit
	// Overrides ICard's method 
	@Override
	public Suit getSuit() 
	{
		return suit;												// Return the card's suit
	}
// ------------------- End Get Suit Method -------------------

// ------------------- Get Rank Method -------------------
	// Method that returns the cards rank
	// Overrides ICard's method 
	@Override
	public Rank getRank() 
	{
		return rank;												// Return the card's rank
	}
// ------------------- End Get Rank Method -------------------

// ------------------- Compare To Method -------------------
	// Method that defines how the class will compare its properties 
	// Overrides ICard's method 
	@Override
	public int compareTo(ICard obj) 
	{
		// Compare cards by their ranks 
		if (this.rank.equals(obj.getRank()))						// Instance card and input card ranks are equal 
		{
			return this.suit.compareTo(obj.getSuit());				// Compare instance card and inputs card suits, and place the superior suit after the other card
		}
		else if (this.rank.compareTo(obj.getRank()) > 0)			// Instance card is larger than input card				
		{
			return 1;												// Place instance card after input card 
		}
		else if (this.rank.compareTo(obj.getRank()) < 0)			// Instance card is smaller than input card 
		{
			return -1;												// Place input card after instance card 
		}	
		else														// Instance card and input card ranks and suits are exactly equal
		{
			return 0;												// Place instance card after input card or input card after instance card 
		}
	}
// ------------------- End Compare To Method -------------------
	
// ------------------- To String Method -------------------
	// Method that converts the card's data to a String
	public String toString() 
	{
		return rank + " of " + suit;								// Return the card's data 
	}
// ------------------- End To String Method -------------------
} // End of class Card
