package com.csi.controller;


import com.csi.model.Customer;
import com.csi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService custmoerDaoImpl;

    @PostMapping("/savedata")

    public String saveAllData(@RequestBody Customer customer) {
        custmoerDaoImpl.saveAllData(customer);

        return "Save Data Successfully";

    }


    @GetMapping("/getdata")

    public List<Customer> getAllData() {
        return custmoerDaoImpl.getAllData();
    }

}
