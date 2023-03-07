package ServiceTasks;

import Exemplar.Exception.TaskNotFoundException;
import Exemplar.Task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Сервисное обслуживание задач
 */


public class TaskService {
    private final Map<Integer, Task> taskMap = new HashMap<>();
    public void add(Task task) {
        this.taskMap.put(task.getId(), task);
    }
    public void remove(Integer taskId) throws TaskNotFoundException {
        if(this.taskMap.containsKey(taskId)) {
            this.taskMap.remove(taskId);
            } else {
            throw new TaskNotFoundException(taskId);
        }
    }

    public Collection<Task> getTasksByDate(LocalDate inputDate) {
        Collection<Task> allTasks = taskMap.values();
        Collection<Task> result = new ArrayList<>();
        for (Task task : allTasks) {
            LocalDateTime taskDateTime = task.getTaskTime();
            if (taskDateTime.toLocalDate().equals(inputDate))
                result.add(task);
        }
        return result;
    }
}


