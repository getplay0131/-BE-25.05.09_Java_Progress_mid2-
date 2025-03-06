package Progress_250227_250228.exception.ex4.exception;

import java.util.Scanner;

public class MainV5 {
    public static void main(String[] args) {
        NetworkServiceV5 service = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")){
                break;
            }

            try{
            service.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    private static void exceptionHandler(Exception e){
        System.out.println("사용자 메시지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out); // 스택 트레이스 출력
//        e.printStackTrace(); // System.err에 스택 트레이스 출력 > 빨간색으로 콘솔에 오류 로그 남겨줌
//        out과 err는 서로 다른 흐름을 통해 출력되므로 함께 사용하면 출력 순서를 보장하지 않는다.
//

//        패턴 매칭 포 인스턴스오브
        if (e instanceof  SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData());
        }
    }
}