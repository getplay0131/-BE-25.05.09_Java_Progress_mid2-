package Progress_250430.test.queue;

public class SchedulerTest {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
//        낮에 작업 저장
        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new BackUpTask());
        scheduler.addTask(new CleanTask());

//        새벽 시간에 실행
        System.out.println("작업 시작");
        run(scheduler);
        System.out.println("작업 완료");
    }

    private static void run(TaskScheduler scheduler){
        while (scheduler.getRemainingTasks() > 0){
            scheduler.processNextTask();
        }
    }
}