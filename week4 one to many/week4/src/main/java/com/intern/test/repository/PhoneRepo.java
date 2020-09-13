package com.intern.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.intern.test.entity.Phone;



public interface PhoneRepo extends JpaRepository<Phone,Integer> {

}
