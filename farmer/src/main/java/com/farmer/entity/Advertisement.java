package com.farmer.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "advertisement")
@SequenceGenerator(name = "ads_id_gen", allocationSize = 1)
public class Advertisement 
{
	@Id
	@Column(name = "ad_id")
	@GeneratedValue(generator = "ads_id_gen", strategy = GenerationType.SEQUENCE)
	private Integer advertisementId;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;
	@Column(name = "content")
	private String content;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "advertisements")
	private List<Crop> crops;
	
	public Advertisement(Integer advertisementId, Supplier supplier, String content, List<Crop> crops) 
	{
		super();
		this.advertisementId = advertisementId;
		this.supplier = supplier;
		this.content = content;
		this.crops = crops;
	}

	public Integer getAdvertisementId()
	{
		return advertisementId;
	}

	public void setAdvertisementId(Integer advertisementId)
	{
		this.advertisementId = advertisementId;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier)
	{
		this.supplier = supplier;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content) 
	{
		this.content = content;
	}

	public List<Crop> getCrops() 
	{
		return crops;
	}

	public void setCrops(List<Crop> crops) 
	{
		this.crops = crops;
	}
	
}
