package com.unstop.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="user001")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable=false,unique = true)
    private String email;
  
    @Column(nullable = false)
    private String pass;
    @Column(nullable = false)
    private String contNo;

    private String address;
    
    @Column(nullable = false)
    private String profile;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob;
    
    @OneToMany(mappedBy = "eventOrganizer", cascade = CascadeType.ALL)
    private List<Event> events;
    
	public User() {
		super();
		
	}
	public User(Long id, String name, String email, String pass, String contNo, String address, String profile,
			Date dob) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.contNo = contNo;
		this.address = address;
		this.profile = profile;
		this.dob = dob;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getContNo() {
		return contNo;
	}
	public void setContNo(String contNo) {
		this.contNo = contNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", pass=" + pass + ", contNo=" + contNo
				+ ", address=" + address + ", profile=" + profile + ", dob=" + dob + "]";
	}
	
}
