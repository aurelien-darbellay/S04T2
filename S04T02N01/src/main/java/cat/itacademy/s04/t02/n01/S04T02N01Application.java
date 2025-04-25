package cat.itacademy.s04.t02.n01;

import cat.itacademy.s04.t02.n01.controllers.FrootController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S04T02N01Application {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N01Application.class, args);
	}
	@Autowired
	FrootController frootController;

}
