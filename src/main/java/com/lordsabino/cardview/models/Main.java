package com.lordsabino.cardview.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static void main() {

        System.out.println("Warriors");
        Card blackLusterSoldier = new Monster(
                "Black Luster Soldier",
                "Monster",
                "EARTH",
                "Warrior/Ritual",
                8,
                3000,
                2500,
                "05405694",
                "Unlimited",
                "You can Ritual Summon this card with \"Black Luster Ritual\"."
        );

        Card celticGuardian = new Monster(
                "Celtic Guardian",
                "Monster",
                "EARTH",
                "Warrior/Normal",
                4,
                1400,
                1200,
                "91152256",
                "Unlimited",
                "An elf who learned to wield a sword, he baffles enemies with lightning-swift attacks."
        );

        Card gaiaTheFierceKnight = new Monster(
                "Gaia the Fierce Knight",
                "Monster",
                "EARTH",
                "Warrior/Normal",
                7,
                2300,
                2100,
                "06368038",
                "Unlimited",
                "A knight whose horse travels faster than the wind. His battle-charge is a force to be reckoned with."
        );

        Card doubleSpell = new MagicAndTrap(
                "Double Spell",
                "Normal",
                "24096228",
                "Cost Effect",
                "Unlimited",
                ""
        );

        Card mysticalSpaceTyphoon = new MagicAndTrap(
                "Mystical Space Typhoon",
                "Spell",
                "Quick-Play",
                "05318639",
                "Effect",
                ""
        );

        List<Card> listOfCards = Arrays.asList(celticGuardian, blackLusterSoldier, gaiaTheFierceKnight, doubleSpell, mysticalSpaceTyphoon);

        for (Card monsters : listOfCards) {
            System.out.println(monsters);
        }

    }
}
