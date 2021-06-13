package excepciones;

public class PrendaInvalidaException extends RuntimeException {
  public PrendaInvalidaException(String msg) {
    super(msg);
  }
}