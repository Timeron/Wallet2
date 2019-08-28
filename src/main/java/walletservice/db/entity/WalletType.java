package walletservice.db.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="wallet_type")
public class WalletType {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@Column(name="default_value")
	private boolean defaultValue;
	private String color;
	private String icon;
	@DateTimeFormat(pattern = "YYYY-MM-DD HH:mm:ss.S")
	private Date timestamp;
	@DateTimeFormat(pattern = "YYYY-MM-DD HH:mm:ss.S")
	private Date updated;
	
	@ManyToOne
	@JoinColumn(name="parent_type")
	private WalletType parentType;
	
	@OneToMany(mappedBy="parentType", fetch=FetchType.EAGER)
	private List<WalletType> childrenTypes;

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

	public boolean getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(boolean defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public WalletType getParentType() {
		return parentType;
	}

	public void setParentType(WalletType parentType) {
		this.parentType = parentType;
	}

	public List<WalletType> getChildrenTypes() {
		return childrenTypes;
	}

	public void setChildrenTypes(List<WalletType> childrenTypes) {
		this.childrenTypes = childrenTypes;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	
}
