package com.in60minutes.service;

import com.in60minutes.entity.Deportment;

import java.util.List;

public interface DeportmentService {

    public Deportment saveDeportment(Deportment deportment);

    public List<Deportment> getDeportment(Deportment deportment);
}
