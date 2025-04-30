package Progress_250430.test.queue;

import java.util.ArrayDeque;

public class TaskScheduler {
        ArrayDeque<Task> tasks = new ArrayDeque<>();

        public void addTask(Task task){
            tasks.offer(task);
        }

//        몇개의 작업이 남았는지 확인하는 메서드
        public int getRemainingTasks(){
            return tasks.size();
        }

        public void processNextTask(){
            tasks.poll().excute();
        }


}