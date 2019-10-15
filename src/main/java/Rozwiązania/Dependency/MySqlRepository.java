package Rozwiązania.Dependency;

import Zadania.Dependency.Task;

public class MySqlRepository implements IRepository {
    @Override
    public void saveTask(Task task) {
        // store task in TASK table
    }

    @Override
    public void deleteTask(String taskId) {
        // delete task from TASK table
    }
}
