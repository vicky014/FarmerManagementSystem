package com.farmer.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "crop")
@SequenceGenerator(name = "cropId_gen", initialValue = 100, allocationSize = 1)
public class Crop 
{
	@Id
	@Column(name = "crop_id")
	@GeneratedValue(generator = "cropId_gen", strategy = GenerationType.SEQUENCE)
	private Integer cropId;
	@Column(name = "crop_name")
	private String cropName;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "ad_id")
	private List<Advertisement> advertisements;
	
	public Crop() 
	{

	}
	
	public Crop(Integer cropId, String cropName) 
	{
		super();
		this.cropId = cropId;
		this.cropName = cropName;
	}

	public Integer getCropId() 
	{
		return cropId;
	}

	public void setCropId(Integer cropId) 
	{
		this.cropId = cropId;
	}

	public List<Advertisement> getAds() 
	{
		return advertisements;
	}

	public void setAds(List<Advertisement> ads) 
	{
		this.advertisements = ads;
	}

	public Integer getcropId() 
	{
		return cropId;
	}

	public void setcropId(Integer cropId) 
	{
		this.cropId = cropId;
	}

	public String getCropName() 
	{
		return cropName;
	}

	public void setCropName(String cropName) 
	{
		this.cropName = cropName;
	}
	
}
