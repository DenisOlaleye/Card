//Denis Olaleye
//24.09.22

/*Playing cards are used in many computer games, including versions of such classics as solitaire, hearts, and poker. Design a Card class that contains a
character data field to hold a suit (s for spades, h for hearts, d for diamonds, or c for clubs) and an integer data field for a value from 1 to 13. (When you
learn more about string handling in the chapter “Characters, Strings, and the StringBuilder,” you can modify the class to hold words for the suits, such as
spades or hearts, as well as words for some of the values—for example, ace or king.) Include get and set methods for each field. Save the class as Card.java.*/

public class Card 
{
	
//	declaring fields
	private char cardSuit;
	private int cardValue;
	
	
//	writing constructor
	public Card(char cardSuit)
	{
		cardSuit = 'S';
		cardValue = 1;
	}
	
//	writing setData methods
	public void setSuit(char s)
	{
		cardSuit = s;
	}
	public void setCardValue(int v)
	{
		cardValue = v;
	}
	
//	writing getData methods
	public char getSuit()
	{
		return cardSuit;
	}
	public int getValue()
	{
		return cardValue;
	}
	
}
