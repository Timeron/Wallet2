package walletservice.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainRunController {

	@RequestMapping("/service")
	public String angularRun(Map<String, Object> model) {
		return "angular";
	}
}
