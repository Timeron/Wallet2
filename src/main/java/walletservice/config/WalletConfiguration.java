package walletservice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"walletservice.db.entity", "walletservice.service", "walletservice.controller", "walletservice.restController"})
public class WalletConfiguration implements WebMvcConfigurer {

	@Profile("prod")
	public String prodProfile() {
		return "Prod";
	}
	
	@Profile("dev")
	public String devProfile() {
		return "DEV";
	}
	
	
	
}