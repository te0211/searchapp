package com.datto.rmm.test.repository;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.datto.rmm.test.model.Device;

public interface DeviceRepository extends PagingAndSortingRepository<Device, Integer> {
	
//	@Query("SELECT a FROM device a WHERE...)
//	 List<Device> getDeviceByName(String text) ;
//	
	
	 List<Device> findAll(Specification<Device> spec);
}
