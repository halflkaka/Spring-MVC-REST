package com.halflkaka.springmvcrest.bootstrap;

import com.halflkaka.springmvcrest.domain.Customer;
import com.halflkaka.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Canjie on 2019-01-12 13:44
 */

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Customer Data...");

        Customer c1 = new Customer();
        c1.setFirstName("Canjie");
        c1.setLastName("Shi");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Kobe");
        c2.setLastName("Bryant");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Lebron");
        c3.setLastName("James");
        customerRepository.save(c3);

        System.out.println("Customer saved: " + customerRepository.count());
    }
}
