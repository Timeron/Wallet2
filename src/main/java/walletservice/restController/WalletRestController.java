package walletservice.restController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import walletservice.service.WalletAccountService;

@RestController
@RequestMapping("/v1")
public class WalletRestController {

	@Autowired
	private WalletAccountService accountService;
	
	Logger logger = LoggerFactory.getLogger(WalletRestController.class);
	
	@RequestMapping("/getAccounts")
	private String getAccounts() {
		logger.info("Request: getAccounts");
		logger.info(accountService.getAllAccounts().toString());
		return "Accounts";
	}
	
}
