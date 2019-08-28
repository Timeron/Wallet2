package walletservice.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import walletservice.db.entity.WalletAccount;

@Repository
public interface WalletAccountRepository extends CrudRepository<WalletAccount, Long>{
	
}
