package card_game_WAR;

import java.util.List;

public class Card {
	
	/*
	* a.Card
	*
	* i.Fields
	*
	* 1.value (contains a value from 2-14 representing cards 2-Ace)
	* 2.name (e.g. Ace of Diamonds, or Two of Hearts)
	*
    * ii.Methods
	*
    * 1.Getters and Setters
   	* 2.describe (prints out information about a card)
	*/
	
	int value;
	String name;
	Card (String name, int value){
		this.value = value;
		this.name = name;
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(this.name + " --- " + this.value);
	}
}
