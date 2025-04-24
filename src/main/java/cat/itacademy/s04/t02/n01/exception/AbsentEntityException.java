package cat.itacademy.s04.t02.n01.exception;

public class AbsentEntityException extends Exception {
    public AbsentEntityException(Long id) {
        super("Froot with id " +id+ "not found");
    }
}
