package Exemplar;

import Exemplar.Exception.InCorrectArgumentException;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task implements Repeatability {
 private static int idGenerator = 1;
    private int id;
    private String title;
    private String description;
    private TaskType type;
    private LocalDateTime taskTime;

    public Task(String title, String description, TaskType type, LocalDateTime taskTime) throws InCorrectArgumentException {
        this.id= idGenerator++;
        setTitle(title);
        setDescription(description);
        setType(type);
        setTaskTime(taskTime);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws InCorrectArgumentException {
        if(title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            throw new InCorrectArgumentException("Заголовок задачи");
        }

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws InCorrectArgumentException {
        if(description != null && !description.isEmpty()) {
            this.description = description;
        } else {
            throw new InCorrectArgumentException(" Описание задачи");
        }
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) throws InCorrectArgumentException {
        if(type != null) {
            this.type = type;
        } else {
            throw new InCorrectArgumentException(" тип задачи");
        }
    }

    public LocalDateTime getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(LocalDateTime taskTime) throws InCorrectArgumentException {
       if(taskTime != null) {
           this.taskTime = taskTime;
       } else {
           throw new InCorrectArgumentException("Дата и время задачи");
       }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(title, task.title) && Objects.equals(description, task.description) && type == task.type && Objects.equals(taskTime, task.taskTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, type, taskTime);
    }

    @Override
    public String toString() {
        return "Задача {" +
                "id=" + id +
                ", Заголовок'" + title + '\'' +
                ", Описание" + description + '\'' +
                ", Тип " + type +
                ", Время" + taskTime +
                '}';
    }
}
