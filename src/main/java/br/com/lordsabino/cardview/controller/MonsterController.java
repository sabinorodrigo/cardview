package br.com.lordsabino.cardview.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lordsabino.cardview.model.Monster;
import br.com.lordsabino.cardview.repository.MonsterRepository;

@RestController
@RequestMapping("/cards")
public class MonsterController {

	private final MonsterRepository monsterRepository;

	public MonsterController(MonsterRepository monsterRepository) {
		this.monsterRepository = monsterRepository;
	}

	@PostMapping
	public Monster createMonster(@RequestBody Monster monster) {
		return monsterRepository.save(monster);
	}
}
