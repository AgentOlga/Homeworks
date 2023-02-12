package Exemplar.Exception;

/**
 * Исключение в случае, если задача не найдена.
 */
public class TaskNotFoundException extends Exception {
    public TaskNotFoundException(Integer taskId) {
        super("Задача с id " + taskId + " не найдена.");
    }
}
