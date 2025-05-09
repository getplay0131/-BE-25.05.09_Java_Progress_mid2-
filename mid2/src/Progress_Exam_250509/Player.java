package Progress_Exam_250509;

import java.util.ArrayList;
import java.util.Collections;

public class Player {
    private String name;
    private int playerNumber;
    private ArrayList<Card> cards = new ArrayList<>(5);
    private int count = 0; // static으로 구성해 공유해서 카운트 문제 발생으로 에이아이 피드백으로 개선

    public Player(String name, int playerNumber) {
        this.name = name;
        this.playerNumber = playerNumber;
        drawCards();
    }

    public void drawCards(){
        for (int i = 0; i < 5; i++) {
            cards.add(new Card());
        }
        Collections.sort(cards);
    }

    public Card getCards() {
        if (count > 4) {
            System.out.println("카드 5장을 다 뽑앗습니다.");
            return null;
        }
        return cards.get(count++);
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    //    에이아이의 조언으로 구성한 메서드
    public ArrayList<Card> getAllCards(){
        return cards;
    }

    public int getCardListSize(){
        return cards.size();
    }

    int calculateScore(){
       int score = 0;
        for (Card card : cards) {
            score += card.getCardNumber();
        }
        return score;
    }

//    에이아이의 조언으로 구성한 메서드
    public void resetCount(){
        count = 0 ;
    }
}