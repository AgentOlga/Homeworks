package Exemplar;

import Exemplar.Exception.InCorrectArgumentException;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * ежегодная задача
 */

public class YearlyTask extends Task{
    public YearlyTask(String title, String description, TaskType type, LocalDateTime taskTime) throws InCorrectArgumentException {
        super(title, description, type, taskTime);
    }


    @Override
    public LocalDate getTaskNextTime(LocalDate dateTime) {
        return dateTime.plusYears(1);
    }
}
