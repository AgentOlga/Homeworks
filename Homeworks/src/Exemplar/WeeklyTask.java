package Exemplar;

import Exemplar.Exception.InCorrectArgumentException;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * еженедельная задача
 */
public class WeeklyTask extends  Task {
    public WeeklyTask(String title, String description, TaskType type, LocalDateTime taskTime) throws InCorrectArgumentException {
        super(title, description, type, taskTime);
    }

    @Override
    public LocalDate getTaskNextTime(LocalDate dateTime) {
        return dateTime.plusWeeks(1);
    }
}
