package Progress_250430.test.queue;

public class BackUpTask implements Task{
    @Override
    public void excute() {
        System.out.println("자료 백업..");
    }
}