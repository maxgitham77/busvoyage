package com.busvoyage.busvoyage.services.impl;

import com.busvoyage.busvoyage.entities.Customer;
import com.busvoyage.busvoyage.repository.CustomerRepository;
import com.busvoyage.busvoyage.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return List.of();
    }
}
