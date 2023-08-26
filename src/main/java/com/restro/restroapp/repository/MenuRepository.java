package com.restro.restroapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restro.restroapp.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Long>{

}
