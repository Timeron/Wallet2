package walletservice.restController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class WalletRestController {

	Logger logger = LoggerFactory.getLogger(WalletRestController.class);
	
	@RequestMapping("/getAccounts")
	private String getAccounts() {
		logger.info("Request: getAccounts");
		return "Accounts";
	}
	
}
