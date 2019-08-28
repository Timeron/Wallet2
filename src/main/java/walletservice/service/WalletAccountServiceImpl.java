package walletservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import walletservice.db.entity.WalletAccount;
import walletservice.db.repository.WalletAccountRepository;

@Service
public class WalletAccountServiceImpl implements WalletAccountService{

	@Autowired
	private WalletAccountRepository accountRepo;
	
	@Override
	public List<WalletAccount> getAllAccounts(){
		return (List<WalletAccount>) accountRepo.findAll();
		
	}
	
}
