package walletservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WalletProperties {
	
	@Value("${welcome.message:test}")
	private String welcomeMessage = "Hello World";
	
	@Value("${wallet.env}")
	private String env;

	public String getWelcomeMessage() {
		return welcomeMessage;
	}

	public String getEnv() {
		return env;
	}
	
}
