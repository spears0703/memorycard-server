package io.cahlee.memorycard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.cahlee.memorycard.entity.CardPackage;
import io.cahlee.memorycard.repository.CardPackageRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CardPackageServiceImpl implements CardPackageService {
	
	private final CardPackageRepository cardPackageRepository;

	@Override
	public List<CardPackage> getCardPackageList() {
		return cardPackageRepository.findAll();
	}

	@Override
	public CardPackage getCardPackage(Long id) {
//		return cardPackageRepository.findById(id);
		return null;
	}

}
