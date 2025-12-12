package com.lordsabino.cardview.service;

import com.lordsabino.cardview.models.Monster;
import com.lordsabino.cardview.repository.MonsterRepository;
import org.springframework.stereotype.Service;

@Service
public class MonsterService {

    private final MonsterRepository monsterRepository;

    public MonsterService(MonsterRepository monsterRepository) {
        this.monsterRepository = monsterRepository;
    }

    public Monster addMonster(Monster monster) {
        if (monster != null)
            return monsterRepository.save(monster);

        throw new RuntimeException("Monster not found");
    }
}
