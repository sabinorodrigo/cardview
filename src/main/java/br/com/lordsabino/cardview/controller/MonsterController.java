package br.com.lordsabino.cardview.controller;

import br.com.lordsabino.cardview.service.MonsterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lordsabino.cardview.model.Monster;
import br.com.lordsabino.cardview.repository.MonsterRepository;

import java.util.List;

@RestController
@RequestMapping("cards")
public class MonsterController {

	private final MonsterService monsterService;

    public MonsterController(MonsterService monsterService) {
        this.monsterService = monsterService;
    }

    @GetMapping
    public ResponseEntity<List<Monster>> findAll() {
		List<Monster> list = monsterService.findAll();
		return ResponseEntity.ok().body(list);
	}

    @GetMapping(value ="/{id}")
    public ResponseEntity<Monster> findById(@PathVariable Long id) {
        Monster monster = monsterService.findById(id);
        return ResponseEntity.ok().body(monster);
    }
}
