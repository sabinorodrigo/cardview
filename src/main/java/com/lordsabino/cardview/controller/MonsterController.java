package com.lordsabino.cardview.controller;

import com.lordsabino.cardview.models.Monster;
import com.lordsabino.cardview.service.MonsterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monster")
public class MonsterController {

    private final MonsterService monsterService;

    public MonsterController(MonsterService monsterService) {
        this.monsterService = monsterService;
    }

    @PostMapping
    public Monster createMonster(@RequestBody Monster monster) {
        return monsterService.addMonster(monster);
    }

    @GetMapping("/find")
    public List<Monster> findAllCards() {
        return monsterService.showMonsters();
    }
}
