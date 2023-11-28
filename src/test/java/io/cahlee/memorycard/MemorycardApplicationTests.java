package io.cahlee.memorycard;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.cahlee.memorycard.entity.Card;
import io.cahlee.memorycard.entity.CardPackage;
import io.cahlee.memorycard.repository.CardPackageRepository;

@SpringBootTest
class MemorycardApplicationTests {
	
	@Autowired
	CardPackageRepository cardPackageRepository;
	
	@Test
	void createData() throws Exception {
		CardPackage cardPackage1 = new CardPackage();
		cardPackage1.setName("DAY01");
		
		List<Card> cards = new ArrayList<>();
		
		Card card1 = new Card();
		card1.setFront("나는 영어를 조금 할 줄 알아요.");
		card1.setBack("I speak a little English.");
		cards.add(card1);
		
		Card card2 = new Card();
		card2.setFront("나는 영어를 조금 할 줄 알아요.");
		card2.setBack("I speak a little English.");
		cards.add(card2);
		
		Card card3 = new Card();
		card3.setFront("나는 영어를 조금 할 줄 알아요.");
		card3.setBack("I speak a little English.");
		cards.add(card3);
		
		Card card4 = new Card();
		card4.setFront("나는 영어를 조금 할 줄 알아요.");
		card4.setBack("I speak a little English.");
		cards.add(card4);
		
		Card card5 = new Card();
		card5.setFront("나는 영어를 조금 할 줄 알아요.");
		card5.setBack("I speak a little English.");
		cards.add(card5);
		
		cardPackage1.setCard(cards);
		
		cardPackageRepository.save(cardPackage1);
	}

}
