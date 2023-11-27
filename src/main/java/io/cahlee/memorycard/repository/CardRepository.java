package io.cahlee.memorycard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.cahlee.memorycard.entity.Card;

public interface CardRepository extends JpaRepository<Card, Long>{

	List<Card> findByCardPackageId(Long id);
}
