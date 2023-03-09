package Exemplar.Exception;

/**
 * Исключения в случае некорректных данных
 */
public class InCorrectArgumentException  extends Exception {
    private final String argument;

    public InCorrectArgumentException(String argument) {
        this.argument = argument;
    }
    @Override
    public String getMessage() {
        return " Параметр  " + argument +" задан некорректно.";
    }
}
