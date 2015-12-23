package com.nss.data.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.nss.data.user.UserBE;

@Entity(name = ActiveStockBE.ENTITY_NAME)
@Table(name = "ACTIVE_STOCK")
public class ActiveStockBE {

	public final static String ENTITY_NAME = "activeStockEntity";

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	
	@Column(name = "STOCK_NAME")
	private String stockName;
	
	@Column(name = "STOCK_SHURTCUT")
	private String stockShurtcut;
	
	@Column(name = "STOCK_NUMBER")
	private long stockNumber;
	
	@Column(name = "STOCK_PRICE")
	private double stockPrice;

	@ManyToOne
	private UserBE userId;

}
