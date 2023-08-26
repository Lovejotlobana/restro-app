package com.restro.restroapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restro.restroapp.model.BasicInformation;
@Repository
public interface BasicInformationRepository extends JpaRepository<BasicInformation, Long>{

}
