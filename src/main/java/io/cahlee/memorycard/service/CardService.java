package io.cahlee.memorycard.service;

import java.util.List;

import io.cahlee.memorycard.entity.Card;

public interface CardService {

	List<Card> getCardList(Long id);

}
