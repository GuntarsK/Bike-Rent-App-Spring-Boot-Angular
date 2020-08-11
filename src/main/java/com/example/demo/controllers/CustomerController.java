package com.example.demo.controllers;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private final CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    @PostMapping("/customers")
    void saveCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
    }


}
