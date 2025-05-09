package Progress_Exam_250509;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Card implements Comparable<Card> {
    private CardSignature suit = drawRandomCardSuit();
    private int cardNumber = drawRandomCardNumber();


    //    카드 번호를 만들고, 번호의 순서를 셔플하고, 해당 카드 목록을 반환하는 메서드
//    이 메서드를 구현함으로 인해 어레이 리스트의 5개 항목에 랜덤으로 뽑힌 숫자가 저장되어 반환된다.
//    이후 이 숫자와 랜덤하게 뽑은 카드 시그니처를 유저의 목록에서 오브젝트의 제네릭 타입으로 해서 시그니처와 숫자를 한 칸에 저장하면 된다.


    public int getCardNumber() {
        return cardNumber;
    }

    int drawRandomCardNumber(){
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < 14; i++) {
            numbers.add(i);
        }
            Collections.shuffle(numbers);

       return numbers.getFirst();
    }

    CardSignature drawRandomCardSuit(){
        ArrayList<CardSignature> signatures = new ArrayList<>();
        signatures.add(CardSignature.DIAMOND);
        signatures.add(CardSignature.HEART);
        signatures.add(CardSignature.CLOVER);
        signatures.add(CardSignature.SPADE);
        Collections.shuffle(signatures);
        return signatures.getFirst();

    }

    @Override
    public int compareTo(Card o) {
        if (this.cardNumber != o.getCardNumber()) {
            return this.cardNumber - o.getCardNumber();
        }
        return this.suit.ordinal() - o.suit.ordinal();
    }

    @Override
    public String toString() {
        return cardNumber + "(" + suit.symbol + ")";
    }

    private enum CardSignature{
        SPADE("\u2660"), HEART("\u2665"), DIAMOND("\u2666"), CLOVER("\u2663");

        private String symbol;

        CardSignature(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }


    }
}