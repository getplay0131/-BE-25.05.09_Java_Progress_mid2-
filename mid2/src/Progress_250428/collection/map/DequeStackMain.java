package Progress_250428.collection.map;

import java.util.ArrayDeque;

public class DequeStackMain {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

//        추가
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

//        데이터 조회
        System.out.println("deque.peek() = " + deque.peek());

//        데이터 꺼내기
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println(deque);
    }
}