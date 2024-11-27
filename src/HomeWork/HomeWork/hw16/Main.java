package HomeWork.HomeWork.hw16;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addTask(new Task("Documentation", 3,"Documentation"));
        manager.addTask(new Task("Bug", 1,"Bug"));
        manager.addTask(new Task("Feature", 2,"Feature"));

        manager.prioritet();
    }
}
