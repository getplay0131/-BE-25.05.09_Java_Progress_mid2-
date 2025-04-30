package Progress_250430.test;

import java.util.ArrayDeque;
import java.util.Stack;

public class SimpleHistoryTest {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        String [] input = {"youtube.com","google.com","facebook.com"};

        for (int i = 0; i < input.length ; i++) {
            deque.push(input[i]);

        }
        for (int i = 0; i < input.length; i++) {
            System.out.println("deque.pop() = " + deque.pop());
        }

    }
}