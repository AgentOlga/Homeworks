package Exemplar;

import Exemplar.Exception.InCorrectArgumentException;

import java.time.LocalDateTime;

/**
 * ежедневная задача
 */
public class DailyTask extends Task {

    public DailyTask(String title, String description, TaskType type, LocalDateTime taskTime) throws InCorrectArgumentException {
        super(title, description, type, taskTime);
    }
    @Override
    public LocalDateTime getTaskNextTime(LocalDateTime dateTime) {
        return dateTime.plusDays(1);
    }
}
