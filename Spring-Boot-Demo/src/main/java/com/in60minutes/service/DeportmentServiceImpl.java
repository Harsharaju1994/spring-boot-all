package com.in60minutes.service;

import com.in60minutes.entity.Deportment;
import com.in60minutes.repository.DeportmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeportmentServiceImpl implements DeportmentService{

    @Autowired
    private DeportmentRepo deportmentRepo;


    @Override
    public Deportment saveDeportment(Deportment deportment) {
        return deportmentRepo.save(deportment);
    }

    @Override
    public List<Deportment> getDeportment(Deportment deportment) {
        return deportmentRepo.findAll();
    }
}
