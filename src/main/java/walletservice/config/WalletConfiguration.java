package walletservice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan("walletservice.controller")
@Configuration
public class WalletConfiguration implements WebMvcConfigurer {

	
	
}