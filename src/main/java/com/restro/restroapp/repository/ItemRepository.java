package com.restro.restroapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restro.restroapp.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long>{

}
