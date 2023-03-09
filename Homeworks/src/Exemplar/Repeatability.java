package Exemplar;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Repeatability {
    LocalDateTime getTaskNextTime (LocalDateTime dateTime);
}
