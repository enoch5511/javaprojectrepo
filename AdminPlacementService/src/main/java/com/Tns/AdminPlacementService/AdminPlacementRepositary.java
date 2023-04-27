package com.Tns.AdminPlacementService;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AdminPlacementRepositary  extends JpaRepository<Admin,Integer> {

}
