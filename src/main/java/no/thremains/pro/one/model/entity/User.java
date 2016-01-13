package no.thremains.pro.one.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@SuppressWarnings("serial")
@Entity
@Table(name="user", catalog="test")
@DynamicInsert(true)
@DynamicUpdate(true)
public class User implements Serializable {

	private int id;
	
	private String userName;
	
	private String pssword;
	
	private int groupId;
	
	private String relName;
	
	private String phone;

	@Id
	@Column(name="id", nullable=false, unique=true)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="username", nullable=false)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name="password", nullable=false)
	public String getPssword() {
		return pssword;
	}

	public void setPssword(String pssword) {
		this.pssword = pssword;
	}

	@Column(name="groupid", nullable=true)
	public int getGroup() {
		return groupId;
	}

	public void setGroup(int groupId) {
		this.groupId = groupId;
	}

	@Column(name="relname", nullable=true)
	public String getRelName() {
		return relName;
	}

	public void setRelName(String relName) {
		this.relName = relName;
	}

	@Column(name="phone", nullable=true)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "id=" + id + "\nuserName=" + userName + "\npssword=" + pssword
				+ "\ngroup=" + groupId + "\nrelName=" + relName + "\nphone="
				+ phone + "\n";
	}
}
