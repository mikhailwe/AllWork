package HomeWork.HomeWork.hw16;

import java.util.PriorityQueue;

public class Manager {
    private PriorityQueue<Task> tasksQueue;

    public Manager() {
        tasksQueue = new PriorityQueue<>();
    }

    public void addTask(Task task) {
        tasksQueue.offer(task);
    }

    public void prioritet() {
        while (!tasksQueue.isEmpty()) {
            System.out.println(tasksQueue.poll());
        }
    }
}
