package io.cahlee.memorycard.service;

import java.util.List;

import io.cahlee.memorycard.entity.CardPackage;

public interface CardPackageService {

	List<CardPackage> getCardPackageList();

	CardPackage getCardPackage(Long id);

}
