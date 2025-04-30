package Progress_250430.test.queue;

public class CompressionTask implements Task {
    @Override
    public void excute() {
        System.out.println("데이터 압축...");
    }
}