package com.nss.data.user;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.nss.data.stock.ActiveStockBE;
import com.nss.data.stock.ArchiveStockBE;

@Entity(name = UserBE.ENTITY_NAME)
@Table(name = "USER")
public class UserBE {
	public final static String ENTITY_NAME = "userEntity";
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	
	@Column(name = "LOGIN")
	private String login;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "MAIL")
	private String mail;
	
	@OneToMany(mappedBy = "userId")
	private List<ActiveStockBE> activeStocks;
	
	@OneToMany(mappedBy = "userId")
	private List<ArchiveStockBE> archiveStocks;
	
	
}
