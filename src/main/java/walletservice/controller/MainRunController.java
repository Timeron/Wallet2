package walletservice.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainRunController {

	Logger logger = LoggerFactory.getLogger(MainRunController.class);
	
	@RequestMapping("/an/service")
	public String angularRun(Map<String, Object> model) {
		logger.info("Open: Service Angular Page");
		return "angular";
	}
	
	@RequestMapping("/jsp/service")
	public String jspRun(Map<String, Object> model) {
		logger.info("Open: Service Angular Page");
		return "angular";
	}
}
