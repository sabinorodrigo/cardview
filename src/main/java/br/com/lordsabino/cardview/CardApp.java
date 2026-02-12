package br.com.lordsabino.cardview;

import java.util.List;

import br.com.lordsabino.cardview.model.Monster;
import br.com.lordsabino.cardview.model.Card;
import br.com.lordsabino.cardview.model.MagicTrap;

public class CardApp {

	public static void main(String[] args) {
		
		Monster blackLusterSolider = 
				new Monster(
				"Black Luster Soldier",
				"EARTH",
				"Warrior/Ritual",
				8,
				3000,
				2500,
				"05405694",
				"Unlimited",
				"You can Ritual Summon this card with \"Black Luster Ritual\"."
				);

		Monster celticGuardian = 
				new Monster(
				"Celtic Guardian",
				"EARTH",
				"Warrior/Normal",
				4,
				1400,
				1200,
				"91152256",
				"Unlimited",
				"An elf who learned to wield a sword, he baffles enemies with lightning-swift attacks."
				);
		
		Monster darkMagician = 
				new Monster(
				"Dark Magician",
				"DARK",
				"Spellcaster/Normal",
				7,
				2500,
				2100,
				"46986414",
				"Unlimited",
				"The ultimate wizard in terms of attack and defense."
				);
		
		MagicTrap doubleSpell =
				new MagicTrap(
						"Double Spell",
						"Normal",
						"24096228",
						"Unlimited",
						"Discard 1 Spell Card, then target 1 Spell Card in your opponent's Graveyard."
						);
		
		MagicTrap sevenToolsOfTheBandit =
				new MagicTrap(
						"Seven Tool of the Banditds",
						"Counter",
						"03819470",
						"Unlimited",
						"When a Trap Card is activated: Pay 1000 LP; negate the activation, and if you do, destroy it."
						);
		
		List<Card> cards = List.of(darkMagician, celticGuardian, blackLusterSolider, doubleSpell, sevenToolsOfTheBandit);
		
		cards.forEach(System.out::println);
	}
}
