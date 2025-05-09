//정렬 작업 필요!
package Progress_Exam_250509;

public class CardGameMain {
    public static void main(String[] args) {

        Player player1 = new Player("player1",1);
        Player player2 = new Player("player2",2);

        printPlayersCard(player1);
        printPlayersCard(player2);
        playTheGame(player1,player2);
    }

   static void printPlayersCard(Player player){
        System.out.print("플레이어" + player.getPlayerNumber() +"의 카드 : [");
//     에이아이의 피드백을 받아 개선된 코드
       for (int i = 0; i < player.getCardListSize(); i++) {
           System.out.print(player.getAllCards().get(i).toString());
           if (i < player.getCardListSize()-1) {
               System.out.print(", ");
           }
       }

//       내가 작성한 코드
//        for (int i = 0; i < player.getCardListSize(); i++) {
//            System.out.print(player.getCards().toString());
//            if (i != player.getCardListSize()-1) {
//                System.out.print(", ");
//            }
//        }
        System.out.println("], 합계 : " + player.calculateScore());
        System.out.println();
    }

    static void playTheGame(Player player1, Player player2){
        if (player1.calculateScore() > player2.calculateScore()) {
            System.out.println("플레이어 " + player1.getPlayerNumber() + " 승리");
        } else if (player1.calculateScore() < player2.calculateScore()) {
            System.out.println("플레이어 " + player2.getPlayerNumber() + " 승리");
        } else {
            System.out.println("무승부");
        }
    }


}