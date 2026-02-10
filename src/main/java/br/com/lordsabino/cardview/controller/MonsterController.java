package br.com.lordsabino.cardview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lordsabino.cardview.model.Monster;
import br.com.lordsabino.cardview.repository.MonsterRepository;

@RestController
@RequestMapping("cards")
public class MonsterController {

	private final MonsterRepository monsterRepository;

	public MonsterController(MonsterRepository monsterRepository) {
		this.monsterRepository = monsterRepository;
	}
	
	@PostMapping
	public Monster addMonster(@RequestBody Monster monster) {
		return monsterRepository.save(monster);
	}
	
	@GetMapping("/{id}")
	public Monster findMonsterById(@PathVariable("id") long id) {
		return monsterRepository.findById(id).orElse(null);
	}
	
}
