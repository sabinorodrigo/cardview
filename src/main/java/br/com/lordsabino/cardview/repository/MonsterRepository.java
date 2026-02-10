package br.com.lordsabino.cardview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lordsabino.cardview.model.Monster;

public interface MonsterRepository extends JpaRepository<Monster, Long>{

}
