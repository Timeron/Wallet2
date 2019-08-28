package walletservice.db.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="wallet_record")
public class WalletRecord {
	
	public WalletRecord(){
		super();
	}
	
	public WalletRecord(Integer id, float value, String description,
			boolean income, boolean transfer, DateTime date, Date updated,
			WalletType walletType, WalletAccount walletAccount,
			WalletAccount destinationWalletAccount,
			WalletAccount sourceWalletAccount) {
		super();
		this.id = id;
		this.value = value;
		this.description = description;
		this.income = income;
		this.transfer = transfer;
		this.date = new Date(date.getMillis());
		this.updated = updated;
		this.walletType = walletType;
		this.walletAccount = walletAccount;
		this.destinationWalletAccount = destinationWalletAccount;
		this.sourceWalletAccount = sourceWalletAccount;
	}
	
	@Id
	@GeneratedValue
	private Integer id;
	private float value;
	private String description;
	private boolean income = false;
	private boolean transfer = false;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.S")
	private Date date;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.S")
	private Date updated;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="wallet_type")
	private WalletType walletType;
	@ManyToOne
	@JoinColumn(name="wallet_account")
	private WalletAccount walletAccount;
	@ManyToOne
	@JoinColumn(name="destination_wallet_account")
	private WalletAccount destinationWalletAccount;
	@ManyToOne
	@JoinColumn(name="source_wallet_account")
	private WalletAccount sourceWalletAccount;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isIncome() {
		return income;
	}
	public void setIncome(boolean income) {
		this.income = income;
	}
	public boolean isTransfer() {
		return transfer;
	}
	public void setTransfer(boolean transfer) {
		this.transfer = transfer;
	}
	public DateTime getDate() {
		return new DateTime(date);
	}
	public void setDate(DateTime date) {
		this.date = new Date(date.getMillis());
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public WalletType getWalletType() {
		return walletType;
	}
	public void setWalletType(WalletType walletType) {
		this.walletType = walletType;
	}
	public WalletAccount getWalletAccount() {
		return walletAccount;
	}
	public void setWalletAccount(WalletAccount walletAccount) {
		this.walletAccount = walletAccount;
	}
	public WalletAccount getSourceWalletAccount() {
		return sourceWalletAccount;
	}
	public void setSourceWalletAccount(WalletAccount sourceWalletAccount) {
		this.sourceWalletAccount = sourceWalletAccount;
	}
	public WalletAccount getDestinationWalletAccount() {
		return destinationWalletAccount;
	}
	public void setDestinationWalletAccount(WalletAccount destinationWalletAccount) {
		this.destinationWalletAccount = destinationWalletAccount;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	
}
