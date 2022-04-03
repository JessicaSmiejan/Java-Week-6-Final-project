package warCardGame;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.text.NumberFormat;
import java.io.IOException;
import java.util.Locale;
import java.text.DecimalFormat;

public class Deck {
	static HashMap<String, Integer> Cards = new HashMap<>();
	ArrayList<Integer> deck = new ArrayList<>();
	ArrayList<Integer> Playerdeck = new ArrayList<>();
	String[] suits= {"hearts", "clubs", "spades", "diamonds"};
	//deck constructor
	public Deck(){
		for(int j = 0; j < 4; j++) {
			for(int i = 2; i <= 14; i++) {
				Card a = new Card(i, suits[j]);
				if(!Cards.containsKey(a)){
					Cards.put(a.toString(), i);
				}
			}
		}
		for (String b : Cards.keySet()) {
			System.out.println(b);
			
		}
	}
	
	public List<Integer>shuffle(){
		for(int j = 0; j < Cards.size(); j++) {
			deck.add(Cards.get(j).valueOf(j));
		}
		Collections.shuffle(deck);
		return deck;
	}
	public List<Integer> shuffle2(){
			for (int j=0; j< Cards.size(); j++){
				Playerdeck.add(Cards.get(j).valueOf(j));
			}
				Collections.shuffle(Playerdeck);
				return Playerdeck;
				
}
	
	public  Integer draw() {
		deck.add(deck.remove(0));
		return(deck.get(51));
	}


	private static void printHand(Card[] cards) {
		for (String b : Cards.keySet()) {
			System.out.println(b);
			
	}
	}

	public Card dealCard() {
		// TODO Auto-generated method stub
		return null;
	}
}
