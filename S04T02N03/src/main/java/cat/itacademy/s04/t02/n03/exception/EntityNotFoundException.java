package cat.itacademy.s04.t02.n03.exception;

public class EntityNotFoundException extends Exception {
    public EntityNotFoundException(String id) {
        super("Froot with id " + id + " not found");
    }
}
