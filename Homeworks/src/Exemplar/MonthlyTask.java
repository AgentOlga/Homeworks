package Exemplar;

import Exemplar.Exception.InCorrectArgumentException;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * ежемесячная задача
 */

public class MonthlyTask extends Task {
    public MonthlyTask(String title, String description, TaskType type, LocalDateTime taskTime) throws InCorrectArgumentException {
        super(title, description, type, taskTime);
    }


    @Override
    public LocalDate getTaskNextTime(LocalDate dateTime) {
        return dateTime.plusMonths(1);
    }
}
