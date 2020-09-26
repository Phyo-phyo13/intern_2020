package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Phone;



@Repository


public interface PhoneRepository extends JpaRepository< Phone, Long>{

}
