package com.intern.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.test.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Long> {

}
