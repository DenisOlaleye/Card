//Denis Olaleye
//25.09.22

/*Write an application that randomly selects two playing cards and displays their values. Simply assign a suit to each of the cards, but generate a random
 *number for each card’s value. Appendix D contains information about generating random numbers. To fully understand the process, you must learn more about Java
classes and methods. However, for now, you can copy the following statements to generate a random number between 1 and 13 and assign it to a variable:

final int CARDS_IN_SUIT = 13;
myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);

 After reading the chapter “Making Decisions,” you will be able to have the game determine the higher card. For now, just observe how the card values change 
as you execute the program multiple times. Save the application as PickTwoCards.java.*/
public class PickTwoCards 
{
	public static void main (String [] args)
	{
//		creating Card class objects
		Card cardOne = new Card('S');
		Card cardTwo = new Card('D');
		final int CARDS_IN_SUIT = 13;
		
		
		
		//setting values to the objects
		cardOne.setSuit('H');
		cardOne.setCardValue((int)(Math.random()*100) % CARDS_IN_SUIT + 1);
		
		cardTwo.setSuit('D');
		cardTwo.setCardValue((int)(Math.random()*100) % CARDS_IN_SUIT + 1); 
		
		showCard(cardOne);
		showCard(cardTwo);
		
	}
	public static void showCard(Card card)
	{
		System.out.println(card.getValue()+ " of " +card.getSuit());
	}
	

}
