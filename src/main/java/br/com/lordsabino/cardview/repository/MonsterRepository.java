package br.com.lordsabino.cardview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lordsabino.cardview.model.Monster;

@Repository
public interface MonsterRepository extends JpaRepository<Monster, Long>{
}
