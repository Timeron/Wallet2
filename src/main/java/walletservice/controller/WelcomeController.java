package walletservice.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import walletservice.config.WalletProperties;

@Controller
public class WelcomeController {

	@Autowired
	private WalletProperties properties;

	Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		logger.info("Open: Welcome Page");
		model.put("message", this.properties.getWelcomeMessage());
		model.put("prop", this.properties.getEnv());
		return "welcome";
	}

}