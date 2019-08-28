package walletservice.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("walletservice.config")
@EnableJpaRepositories("walletservice.db.repository")
@EntityScan("walletservice.db.entity")
@SpringBootApplication
public class SpringBoot extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBoot.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBoot.class, args);
	}
}