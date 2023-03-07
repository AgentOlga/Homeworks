package Exemplar;

import Exemplar.Exception.InCorrectArgumentException;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * однократная задача
 */
public class OneTimeTask extends  Task {
    public OneTimeTask(String title, String description, TaskType type, LocalDateTime taskTime) throws InCorrectArgumentException {
        super(title, description, type, taskTime);
    }

    @Override
    public LocalDate getTaskNextTime(LocalDate dateTime) {
        return null;
    }
}
