package cat.itacademy.s04.t02.n02.exception;

public class EntityNotFoundException extends Exception {
    public EntityNotFoundException(Long id) {
        super("Froot with id " + id + " not found");
    }
}
