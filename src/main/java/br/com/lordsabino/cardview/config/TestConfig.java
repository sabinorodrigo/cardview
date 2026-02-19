package br.com.lordsabino.cardview.config;

import br.com.lordsabino.cardview.model.Monster;
import br.com.lordsabino.cardview.repository.MonsterRepository;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

public class TestConfig implements CommandLineRunner {

    private final MonsterRepository monsterRepository;

    public TestConfig(MonsterRepository monsterRepository) {
        this.monsterRepository = monsterRepository;
    }

    @Override
    public void run(String... args) throws Exception {

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

        monsterRepository.saveAll(Arrays.asList(blackLusterSolider, celticGuardian));
    }
}
