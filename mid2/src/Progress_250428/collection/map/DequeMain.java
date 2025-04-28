package Progress_250428.collection.map;

import java.util.ArrayDeque;

public class DequeMain {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

//        데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
deque.offerLast(3);
        System.out.println(deque);
deque.offerLast(4);
        System.out.println(deque);

//        데이터 조회
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast()() = " + deque.peekLast());

//        데이터 꺼내기
        System.out.println("pollFirst = " + deque.pollFirst());
        System.out.println("pollFirst = " + deque.pollFirst());
        System.out.println("pollLast = " + deque.pollLast());
        System.out.println("pollLast = " + deque.pollLast());
        System.out.println(deque);
    }
}