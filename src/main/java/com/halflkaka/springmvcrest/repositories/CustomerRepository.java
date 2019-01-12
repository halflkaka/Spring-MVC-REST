package com.halflkaka.springmvcrest.repositories;

import com.halflkaka.springmvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Canjie on 2019-01-12 13:34
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
