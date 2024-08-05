package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "UsersDetails")
public class Userdetails {
	 @Id // Marks this field as the primary key
	    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates the primary key value
	    private Long id;

	    @Column(nullable = false) // Maps this field to a database column, and makes it non-nullable
	    private String name;
	    

	    @Column(nullable = false) // Maps this field to a database column, and makes it non-nullable
	    private String phone;
	    

	    @Column(nullable = false) // Maps this field to a database column, and makes it non-nullable
	    private String email;
	    

	    @Column(nullable = false) // Maps this field to a database column, and makes it non-nullable
	    private String role;
	    

	    @Column(nullable = false) // Maps this field to a database column, and makes it non-nullable
	    private String username;

	    @Column(nullable = false) // Maps this field to a database column, and makes it non-nullable
	    private String password;

		@ManyToOne
		@JoinColumn(name = "manager_id", nullable = false)
		private Managerdetails manager;

	@ManyToOne
	@JoinColumn(name = "hr_id", nullable = false)
	private HRdetails hr;

	public Userdetails() {
	}

	public Userdetails(Long id, String name, String phone, String email, String role, String username, String password, Managerdetails manager, HRdetails hr) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.role = role;
		this.username = username;
		this.password = password;
		this.manager = manager;
		this.hr = hr;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getManager() {
		return manager.getId();
	}

	public void setManager(Managerdetails manager) {
		this.manager = manager;
	}

	public Long getHr() {
		return hr.getId();
	}

	public void setHr(HRdetails hr) {
		this.hr = hr;
	}
}
