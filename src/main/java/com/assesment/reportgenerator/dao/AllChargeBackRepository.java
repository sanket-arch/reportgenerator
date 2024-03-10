package com.assesment.reportgenerator.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assesment.reportgenerator.entities.Chargeback;

public interface AllChargeBackRepository extends JpaRepository<Chargeback, String> {

    @Query(value = "write query", nativeQuery = true)
    public List<Chargeback> findAllColumn();
}
