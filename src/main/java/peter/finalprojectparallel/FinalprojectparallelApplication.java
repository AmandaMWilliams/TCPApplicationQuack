package peter.finalprojectparallel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
//import peter.finalprojectparallel.config.SwaggerConfig;

@EnableAsync
@SpringBootApplication
//@Import(SwaggerConfig.class)
public class FinalprojectparallelApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalprojectparallelApplication.class, args);
	}

}
