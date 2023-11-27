package io.cahlee.memorycard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.cahlee.memorycard.entity.CardPackage;

public interface CardPackageRepository extends JpaRepository<CardPackage, Long>{

}
