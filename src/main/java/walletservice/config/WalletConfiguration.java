package walletservice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"walletservice.controller", "walletservice.restController"})
public class WalletConfiguration implements WebMvcConfigurer {

	@Profile("dev")
	public String devProfile() {
		return "DEV";
	}
	
}