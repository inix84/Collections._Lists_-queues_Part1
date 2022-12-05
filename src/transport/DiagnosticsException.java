package transport;
import serviceStation.*;
import mechanic.*;
import sponsor.*;
import transport.*;
import driver.*;

public class DiagnosticsException extends RuntimeException {
    public DiagnosticsException() {
    }

    public DiagnosticsException(String message) {
        super(message);
    }
}