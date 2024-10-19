package com.example.hotel_management_api.repositories;

import com.example.hotel_management_api.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
