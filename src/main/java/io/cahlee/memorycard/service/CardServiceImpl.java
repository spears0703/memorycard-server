package io.cahlee.memorycard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.cahlee.memorycard.entity.Card;
import io.cahlee.memorycard.repository.CardRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {
	
	private final CardRepository cardRepository;

	@Override
	public List<Card> getCardList(Long id) {
		return cardRepository.findByCardPackageId(id);
	}

}
