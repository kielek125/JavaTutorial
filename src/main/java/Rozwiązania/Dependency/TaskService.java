package Rozwiązania.Dependency;

import Zadania.Dependency.Task;

public class TaskService {
    private IRepository repository;

    public TaskService(IRepository repository) {
        this.repository = repository;
    }

    public void addTask(Task task) {
        repository.saveTask(task);
    }

    public void removeTask(String taskId) {
        repository.deleteTask(taskId);
    }
}
