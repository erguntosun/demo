package de.haegerconsulting.ergun.haegertime.controller;

import de.haegerconsulting.ergun.haegertime.model.Customer;
import de.haegerconsulting.ergun.haegertime.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerService;


    @GetMapping("/Customer")
    private List<Customer> getAllCustomer()
    {
        return customerService.getAllCustomer();
    }

    @GetMapping("/Customer/{id}")
    private Customer getCustomer(@PathVariable("id") int id)
    {
        return customerService.getCustomerById(id);
    }

    //creating a delete mapping that deletes a specific customer
    @DeleteMapping("/Customer/{id}")
    private void deleteCustomer(@PathVariable("id") int id)
    {
        customerService.delete(id);
    }
    //creating post mapping that post the customer detail in the database
    @PostMapping("/customer")
    private int savecustomer(@RequestBody Customer customer)
    {
        customerService.saveOrUpdate(customer);
        return customer.getId();
    }
}
