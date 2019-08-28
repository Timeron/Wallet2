package walletservice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import walletservice.config.WalletProperties;

@Controller
public class WelcomeController {

	@Autowired
	private WalletProperties properties;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.properties.getWelcomeMessage());
		model.put("prop", this.properties.getEnv());
		return "welcome";
	}

}