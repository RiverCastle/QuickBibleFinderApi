package JesusDisciples.Bible;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class QuickBibleFinderApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickBibleFinderApiApplication.class, args);
	}

}
