package cat.itacademy.s04.t02.n01.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({AbsentEntityException.class})
    public void handleAbsentEntity(AbsentEntityException e){
        System.out.println(e.getMessage());
    }

}
