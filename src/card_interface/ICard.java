package card_interface;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Interface: ICard
 * Language: Java
 * Date: 12/8/17
 * Description: This interface contains attributes related to a card that is in a deck.
 */

// This interface holds attributes of a card in a deck and is Comparable
public interface ICard extends Comparable <ICard> 
{
	// Instance variables 
	enum Suit {SPADES, HEARTS, DIAMONDS, CLUBS}							// Card suit, must choose one of the options
	enum Rank {DEUCE, THREE, FOUR, FIVE, SIX, 							// Card rank, must choose one of the options 
		SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}
// ------------------- Get Suit Method -------------------
	// Method that returns the suit of the card 
	Suit getSuit();
// ------------------- End Get Suit Method -------------------	
	
// ------------------- Get Rank Method -------------------
	// Method that returns the rank of the card 
	Rank getRank();
// ------------------- End Get Rank Method -------------------
} // End of interface ICard
