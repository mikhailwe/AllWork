package HomeWork.HomeWork.hw16;

import java.util.Objects;

public class Task implements Comparable<Task> {

    private String Name;
    private int priority;
    private String Category;

    public Task(String name, int priority, String category) {
        Name = name;
        this.priority = priority;
        Category = category;
    }

    public String getCategory() {
        return Category;
    }

    public String getName() {
        return Name;
    }

    public int getPriority() {
        return priority;
    }


    @Override
    public String toString() {
        return "Task{" +
                "Category='" + Category + '\'' +
                ", Name='" + Name + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Task o) {
        if (this.priority != o.priority) {
        return Integer.compare(this.priority, o.priority);
        }
        return this.Category.compareTo(o.Category);
    }
}
