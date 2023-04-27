package com.Tns.AdminPlacementService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class AdminPlacementService {

@Autowired
	
	private AdminPlacementRepositary repo;
	public List <Admin> listAll()
	{
		return repo.findAll();
	}
	public Admin get(Integer ad_id)
	{
		return repo.findById(ad_id).get();
	}
	public void delete(Integer ad_id)
	{
		repo.deleteById(ad_id);
	}
	public void save (Admin adm)
	{
		repo.save(adm);
	}

}

