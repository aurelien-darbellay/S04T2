package cat.itacademy.s04.t02.n03;

import cat.itacademy.s04.t02.n03.controllers.FrootController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S04T02N03Application {

    public static void main(String[] args) {
        SpringApplication.run(S04T02N03Application.class, args);
    }

    @Autowired
    FrootController frootController;
}
