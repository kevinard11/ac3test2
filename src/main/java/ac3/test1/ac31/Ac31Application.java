package ac3.test1.ac31;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Ac31Application {

	public static void main(String[] args) {
		SpringApplication.run(Ac31Application.class, args);
	}

}
