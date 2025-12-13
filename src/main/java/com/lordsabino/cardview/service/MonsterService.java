package com.lordsabino.cardview.service;

import com.lordsabino.cardview.models.Monster;
import com.lordsabino.cardview.repository.MonsterRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

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

    public List<Monster> showMonsters() {
        return monsterRepository.findAll();
    }

    public Optional<Monster> getMonster(long id) {
        return monsterRepository.findById(id);
    }
}
