package com.busvoyage.busvoyage.services;

import com.busvoyage.busvoyage.entities.Customer;

import java.util.List;

public interface CustomerService {

    Customer addCustomer(Customer customer);

    List<Customer> getAllCustomers();
}
