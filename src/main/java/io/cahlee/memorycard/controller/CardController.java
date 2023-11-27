package io.cahlee.memorycard.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.cahlee.memorycard.entity.Card;
import io.cahlee.memorycard.service.CardService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CardController {
	
	private final CardService cardService;

	@GetMapping(value="/card/{id}")
	public List<Card> getCardList(@RequestParam Long cardPackageId) {
		return cardService.getCardList(cardPackageId);
	}
}
