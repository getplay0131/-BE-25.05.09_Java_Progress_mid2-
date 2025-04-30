package Progress_250430.test.queue;

import java.util.ArrayDeque;

public class PrinterQueueTest {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.offer("doc1");
        deque.offer("doc2");
        deque.offer("doc3");

        System.out.println("출력: " + deque.poll());
        System.out.println("출력: " + deque.poll());
        System.out.println("출력: " + deque.poll());

    }
}