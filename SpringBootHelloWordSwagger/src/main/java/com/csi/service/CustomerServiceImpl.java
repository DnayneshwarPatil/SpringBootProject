package com.csi.service;

import com.csi.dao.CustomerDao;
import com.csi.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao custmoerDaoImpl;


    @Override
    public void saveAllData(Customer customer) {
        custmoerDaoImpl.saveAllData(customer);
    }

    @Override
    public List<Customer> getAllData() {
        return custmoerDaoImpl.getAllData();
    }
}
