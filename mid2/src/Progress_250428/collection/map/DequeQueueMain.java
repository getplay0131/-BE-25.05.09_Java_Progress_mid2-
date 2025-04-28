package Progress_250428.collection.map;

import java.util.ArrayDeque;

public class DequeQueueMain {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

//        추가
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

//        데이터 조회
        System.out.println("deque.peek() = " + deque.peek());

//        데이터 꺼내기
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println(deque);
    }
}