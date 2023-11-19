package com.in60minutes.controller;

import com.in60minutes.entity.Deportment;
import com.in60minutes.service.DeportmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deportment")
public class DeportmentController {

    @Autowired
    private DeportmentService deportmentService;

    @PostMapping("/save")
    public Deportment saveDeportments(@RequestBody Deportment deportment){
        return deportmentService.saveDeportment(deportment);

    }

    @GetMapping("/getall")
    public List<Deportment> getAllData(Deportment deportment){

        return deportmentService.getDeportment(deportment);
    }
}
