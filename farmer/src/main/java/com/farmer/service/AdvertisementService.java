package com.farmer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmer.dao.AdvertisementDao;
import com.farmer.dao.CropDao;

@Service
public class AdvertisementService
{
	@Autowired
	AdvertisementDao adsDao;
	
	@Autowired
	CropDao cropDao;
	
	@Autowired
	public void advertisementDaoService(AdvertisementDao adsDao)
	{
		this.adsDao = adsDao;
	}
	
	@Autowired
	public void cropDaoService(CropDao cropDao)
	{
		this.cropDao = cropDao;
	}
}
