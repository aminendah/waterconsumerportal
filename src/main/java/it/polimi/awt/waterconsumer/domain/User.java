package it.polimi.awt.waterconsumer.domain;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;


@Entity
public class User {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer oid;
	
	@NotBlank(message = "{NotBlank.User.username}")
	private String username;
	
	@NotBlank(message = "{NotBlank.User.password}")
	private String password;
	
	private String zipcode;
	
	@OneToOne
	@JoinColumn(name="oid", insertable=false, updatable=false)
	private	NeutralUser neutralUser;
	
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getUsername() {
		return username;
	}
	public void setIsbn(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	
	@Override
    public String toString() {
        return "LoginModel{" + "username=" + username + ", password=" + password + '}';
    }
	
	public NeutralUser getNeutralUser() {
		return neutralUser;
	}
	public void setNeutralUser(NeutralUser neutralUser) {
		this.neutralUser = neutralUser;
	}
	
}
