package walletservice.db.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="wallet_account")
public class WalletAccount {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String description;
	private String currency;
	@DateTimeFormat(pattern = "YYYY-MM-DD HH:mm:ss.S")
	private Date timestamp;
	@DateTimeFormat(pattern = "YYYY-MM-DD HH:mm:ss.S")
	private Date updated;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	@Override
	public String toString() {
		return "WalletAccount [id=" + id + ", name=" + name + ", description=" + description + ", currency=" + currency
				+ ", timestamp=" + timestamp + ", updated=" + updated + "]";
	}
	
	
}
