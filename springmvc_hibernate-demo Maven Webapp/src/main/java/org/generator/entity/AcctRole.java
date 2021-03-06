package org.generator.entity;

// Generated 2016-9-6 12:45:33 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * AcctRole generated by hbm2java
 */
@Entity
@Table(name = "acct_role", catalog = "test")
public class AcctRole implements java.io.Serializable {

	private String id;
	private String name;
	private Set<AcctUser> acctUsers = new HashSet<AcctUser>(0);
	private Set<AcctAuthority> acctAuthorities = new HashSet<AcctAuthority>(0);

	public AcctRole() {
	}

	public AcctRole(String id) {
		this.id = id;
	}

	public AcctRole(String id, String name, Set<AcctUser> acctUsers,
			Set<AcctAuthority> acctAuthorities) {
		this.id = id;
		this.name = name;
		this.acctUsers = acctUsers;
		this.acctAuthorities = acctAuthorities;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 36)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "acct_user_role", catalog = "test", joinColumns = { @JoinColumn(name = "role_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "user_id", nullable = false, updatable = false) })
	public Set<AcctUser> getAcctUsers() {
		return this.acctUsers;
	}

	public void setAcctUsers(Set<AcctUser> acctUsers) {
		this.acctUsers = acctUsers;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "acct_role_authority", catalog = "test", joinColumns = { @JoinColumn(name = "role_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "authority_id", nullable = false, updatable = false) })
	public Set<AcctAuthority> getAcctAuthorities() {
		return this.acctAuthorities;
	}

	public void setAcctAuthorities(Set<AcctAuthority> acctAuthorities) {
		this.acctAuthorities = acctAuthorities;
	}

}
