package Progress_250430.test.stack;

import java.util.ArrayDeque;

public class BrowsetHistory {
    private ArrayDeque<String > deque = new ArrayDeque<>();
    String currentPage = null;
    public void visitPage(String str){
        if (!str.isEmpty() && currentPage != null) {
            deque.push(currentPage);
        }
        currentPage = str;
        System.out.println("방문 : " + currentPage);
    }

    public String  goBack(){
        if (currentPage != null) {
            String pop = deque.pop();
            System.out.println("뒤로 가기 : " + pop);
            currentPage = pop;
            return currentPage;
        }

        return null;
    }
}