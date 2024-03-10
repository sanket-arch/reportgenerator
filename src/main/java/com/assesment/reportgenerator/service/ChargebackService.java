package com.assesment.reportgenerator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.reportgenerator.dao.AllChargeBackRepository;
import com.assesment.reportgenerator.dao.PostedChargeBackrepository;
import com.assesment.reportgenerator.entities.Chargeback;

@Service
public class ChargebackService {

    @Autowired
    PostedChargeBackrepository postedChargeBackrepository;

    @Autowired
    AllChargeBackRepository allChargeBackRepository;

    public List<Chargeback> getAllPostedColumn() {

        return this.postedChargeBackrepository.findAllPostedColumn();
    }

    public List<Chargeback> getAllColumn() {

        return this.allChargeBackRepository.findAllColumn();
    }
}
