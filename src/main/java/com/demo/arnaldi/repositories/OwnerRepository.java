package com.demo.arnaldi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.arnaldi.model.OwnerEntity;

public interface OwnerRepository extends JpaRepository<OwnerEntity, Long>{

}
