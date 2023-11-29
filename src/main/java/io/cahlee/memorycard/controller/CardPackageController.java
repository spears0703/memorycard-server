package io.cahlee.memorycard.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.cahlee.memorycard.entity.CardPackage;
import io.cahlee.memorycard.service.CardPackageService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CardPackageController {
	
	private final CardPackageService cardPackageService;

	@GetMapping(value="/card-package")
	public List<CardPackage> getCardPackageList() {
		return cardPackageService.getCardPackageList();
	}
	
	@GetMapping(value="/card-package/{id}")
	public CardPackage getCardPackage(@PathVariable Long id) {
		return cardPackageService.getCardPackage(id);
	}
	
	@PostMapping(value="/card-pacakge")
	public void postCardpackage(@RequestBody CardPackage cardPackage) {
		cardPackageService.saveCardPacakge(cardPackage);
	}

}
