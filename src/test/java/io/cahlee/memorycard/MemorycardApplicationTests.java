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
		cardPackage1.setName("DAY05");
		
		List<Card> cards = new ArrayList<>();
		
		String[][] words = {
//				{"나는 영어를 조금 할 줄 알아요.", "I speak a little English."},
//				{"나는 그가 무척 잘 생겼다고 생각해요.", "I think he's very handsome."},
//				{"나는 완두콩과 당근을 싫어해요.", "I hate green peas and carrots."},
//				{"우리는 히드로 공항에서 가까운 런던 서부에 살아요.", "We live in western London near Heathrow Airport."},
//				{"그는 지하철을 타고 출근해요.", "He rides the subway to go to work."},
//				{"그녀는 슈퍼마켓에 매일 아침 걸어가요.", "She walks to the supermarket every morning."},
//				{"우리 아빠는 보험회사에서 일해요.", "My father works at an insurance company."},
//				{"그는 프랑스어를 조금 할 줄 알아요.", "He speaks a little French."},
//				{"나는 그녀가 무척 아름답다고 생각해요.", "I hate fried chicken."},
//				{"나는 치킨을 싫어해요.", "They live in a small town near the station."},
//				{"그들은 역에서 가까운 작은 동네에 살아요.", "She rides the bus to go to work."},
//				{"그녀는 버스를 타고 출근해요.", "He walks to the library every morning."},
//				{"그는 도서관에 매일 아침 걸어가요.", "My mother works at an insurance company."}
//				{"로큰롤을 즐기나요?", "Do you enjoy rock 'n' roll?"},
//				{"부모님이 근처에 사시나요?", "Do your parents live near you?"},
//				{"고무는 어디서 나오는 거죠?", "Where does rubber come from?"},
//				{"\"한옥\"은 무슨 뜻이에요?", "What does \"hanok\" mean?"},
//				{"얼마나 자주 출장 가요?", "How often do you travel on business?"},
//				{"골프를 치려면 돈이 얼마나 들어요?", "How much does it cost to play golf?"},
//				{"무슨 일을 하시죠?", "What do you do?"},
//				{"영어를 할 줄 알아요?", "Do you speak English?"},
//				{"부모님 두 분 다 일하시나요?", "Do your parents both work?"},
//				{"럭비는 어느 나라에서 온 거죠?", "Where does rugby come from?"},
//				{"그것은 무슨 뜻이에요?", "What does it mean?"},
//				{"그녀는 얼마나 자주 해외 여행을 가요?", "How often does she travel abroad?"},
//				{"가입하려면 돈이 얼마나 들어요?", "How much does it cost to join?"},
//				{"휴가 때는 무엇을 하시죠?", "What do you do during vacations?"}
//				{"나는 35살이에요.", "I am 35 years old."},
//				{"나는 지금 정말 졸려요.", "I am really sleepy now."},
//				{"우리 부모님은 선생님이에요.", "My parents are teachers."},
//				{"나는 캐나다 사나다 사람이고, 밴쿠버 출신이에요.", "I am Canadian and I am from Vancouver."},
//				{"날씨가 춥고 비가 와요.", "The weather is cold and rainy."},
//				{"나는 기혼이고, 아이가 두 명 있어요.", "I'm married and have two kids."},
//				{"출석은 선택사항이에요.", "Attendance is optional."},
//				{"나는 43살이에요.", "I am 43 years old."},
//				{"나는 지금 정말 배고파요.", "I am really hungry now."},
//				{"우리 부모님은 은퇴하셨어요.", "My parents are retired."},
//				{"나는 호주 사람이고, 시드니 출신이에요.", "I am Australian and I'm from Sydney."},
//				{"날씨가 따뜻하고 화창해요.", "The weather is warm and sunny."},
//				{"나는 미혼이고, 혼자 살아요.", "I'm single and live alone."},
//				{"출석은 필수예요.", "Attendance is required."}
//				{"나는 지금 회사에 있어요.", "I am at my office now."},
//				{"그녀는 오늘 사무실에 있어요.", "She is in her office today."},
//				{"마이크는 프랑스에서 1주일 동안 머물 거예요.", "Mike is in France for a week."},
//				{"당신은 지금 지하 1층에 있어요.", "You are in the first basement now."},
//				{"우리는 지금 중앙 로비 안에 있어요.", "We are now inside the main lobby."},
//				{"그들은 오늘 오후에 경기장에 있을 거예요.", "They are at the stadium this afternoon."},
//				{"그 백화점은 지하철 가까이에 있어요.", "The department store is near the subway."},
//				{"나는 지금 지하철에 있어요.", "I am on the subway now."},
//				{"그는 오늘 사무실에 있어요.", "He is in his office today."},
//				{"마이크는 스페인에서 열흘 동안 머물 거예요.", "Mike is in Spain for ten days."},
//				{"당신은 지금 2층에 있어요.", "You are on the second floor now."},
//				{"우리는 지금 중앙 도서관 밖에 있어요.", "We are now outside the main library."},
//				{"그들은 지금 카페이 있어요.", "The are at the coffee shop now."},
//				{"그 박물관은 지하철 근처에 있어요.", "The museum is near the subway."}
				{"배고프세요?", "Are you hungry?"},
				{"A : 미국에서 오셨어요? B 아니요, 우리는 캐나다에서 왔어요.", "A : Are you from the United States? B : No, We're from Canada."},
				{"A : 이 버스가 멜버른으로 가는 버스인가요? B : 네, 맞아요.", "A : Is this the bus to Melbourne? B : Yes, It is."},
				{"오늘 일찍 가도 되나요?", "Is it okay if I leave early?"},
				{"영업 시간이 어떻게 되시죠?", "What are your business hours?"},
				{"버스 터미널이 어디죠?", "Where is the bus terminal."},
				{"다음 기차는 언제죠?", "When is the next train?"},
				{"걱정되세요?", "Are you worried?"},
				{"A : 영국에서 오셨어요? 아니요, 미국에서 왔어요.", "A : Are you from the U.K.? B : No, I'm from the U.S."},
				{"A : 이 기차가 로스앤젤레스로 가는 기차인가요? B : 네, 맞아요.", "A : Is this the train to Los Angeles? B : Yes, It is."},
				{"여기 앉아도 되나요?", "Is it okay if I seat here?"},
				{"무슨 요일에 문을 여나요?", "What days are you open?"},
				{"가장 가까운 서점이 어디죠?", "Where is the nearest bookstore?"},
				{"다음 비행기는 언제죠?", "When is the next flight?"}
		};
		
		for(String[] word : words) {
			Card card = new Card(word[0], word[1]);
			cards.add(card);
		}
		
		cardPackage1.setCard(cards);
		
		cardPackageRepository.save(cardPackage1);
	}

}
