package com.halflkaka.springmvcrest.services;

import com.halflkaka.springmvcrest.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Canjie on 2019-01-12 13:37
 */
public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
