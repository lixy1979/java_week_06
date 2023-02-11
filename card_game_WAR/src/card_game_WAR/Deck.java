package card_game_WAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	/* b.Deck
	 * 
	 * i.Fields
	 * 
	 * 1.cards (List of Card)
	 * 
	 * ii.Methods
	 * 
	 * 1.shuffle (randomizes the order of the cards)
	 * 2.draw (removes and returns the top card of the Cards field)
	 * 3.In the constructor, when a new Deck is instantiated, the Cards 
	 * field should be populated with the standard 52 cards. 
	 */
	
     List<Card> cards = new ArrayList<Card>();
     Deck(){
    	 String[] names = {"Clubs", "Diamonds", "Hearts", "Spades"};
    	 String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven",
    			            "Eight", "Nine", "Ten", "Jack", "Queen", "King",
    			            "Ace"};
    	 for (String name : names) {
    		 int i = 2;
    		 for ( String number : numbers) {
    			 String tmpName = number + " of " + name;
    			 int value = i++;
    			 Card card = new Card (tmpName, value);	 
    			 this.cards.add(card);
    		 }
    	 }
     }
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public void describe() {
		for(Card card : this.cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
	
	
	
	
	

}
