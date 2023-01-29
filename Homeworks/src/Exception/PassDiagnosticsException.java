package Exception;

public class PassDiagnosticsException extends Exception {
    public PassDiagnosticsException(String message) {
        super("Необходимо указать тип прав!");
    }
}
