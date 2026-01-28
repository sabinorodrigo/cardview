package br.com.lordsabino.cardview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import br.com.lordsabino.cardview.model.Card;
import br.com.lordsabino.cardview.model.Monster;
import br.com.lordsabino.cardview.model.enums.Attribute;
import br.com.lordsabino.cardview.model.enums.Types;


public class Main {

	public static void main(String[] args) {
		
		Card blackLusterSoldier = new Monster(
				"Black Luster Solider",
				Attribute.EARTH,
				Set.of(Types.WARRIOR, Types.RITUAL),
				8,
				3000,
				2500,
				"05405694",
				"Unlimited",
				"You can Ritual Summon this card with \"Black Luster Ritual\"."
				);
		
		
		
		List<Card> listOfCards = Arrays.asList(blackLusterSoldier);
		
		listOfCards.forEach(System.out::println);
	}
}
