package com.restro.restroapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restro.restroapp.model.Staff;
@Repository
public interface StaffRepository extends JpaRepository<Staff, Long>{

//	Staff save(Staff staff);
}
