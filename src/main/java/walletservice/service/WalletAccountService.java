package walletservice.service;

import java.util.List;

import walletservice.db.entity.WalletAccount;

public interface WalletAccountService {

	List<WalletAccount> getAllAccounts();

}
