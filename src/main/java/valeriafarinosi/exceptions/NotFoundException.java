package valeriafarinosi.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super("Evento non trovato!");
    }
}
