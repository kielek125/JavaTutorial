package Rozwiązania.Dependency;

import Zadania.Dependency.Task;

public interface IRepository {
    void saveTask(Task task);

    void deleteTask(String taskId);
}
