package Progress_250430.test.stack;

public class BrowserHistoryTest {
    public static void main(String[] args) {
        BrowsetHistory history = new BrowsetHistory();
        history.visitPage("youtube.com");
        history.visitPage("google.com");
        history.visitPage("facebook.com");
        history.toString();


        String currentPage1 = history.goBack();
        System.out.println("currentPage1 = " + currentPage1);
//
        String currentPage2 = history.goBack();
        System.out.println("currentPage2 = " + currentPage2);
    }
}