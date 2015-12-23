package com.nss.data.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.nss.data.user.UserBE;

@Entity(name = ArchiveStockBE.ENTITY_NAME)
@Table(name = "ARCHIVE_STOCK")
public class ArchiveStockBE {
	
	public final static String ENTITY_NAME = "archiveStockEntity";
	
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
	
	@Column(name = "STOCK_SOLD_PRICE")
	private double stockSoldPrice;
	
	@ManyToOne
	private UserBE userId;

}
