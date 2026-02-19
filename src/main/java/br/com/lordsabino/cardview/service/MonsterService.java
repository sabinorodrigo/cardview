package br.com.lordsabino.cardview.service;

import br.com.lordsabino.cardview.model.Monster;
import br.com.lordsabino.cardview.repository.MonsterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonsterService {

    private final MonsterRepository monsterRepository;

    public MonsterService(MonsterRepository monsterRepository) {
        this.monsterRepository = monsterRepository;
    }

    public List<Monster> findAll() {
        return monsterRepository.findAll();
    }

    public Monster findById(Long id) {
        Optional<Monster> monster = monsterRepository.findById(id);
        return monster.get();
    }
}
