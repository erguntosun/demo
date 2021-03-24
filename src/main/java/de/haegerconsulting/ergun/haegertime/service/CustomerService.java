package de.haegerconsulting.ergun.haegertime.service;

import de.haegerconsulting.ergun.haegertime.model.Customer;
import de.haegerconsulting.ergun.haegertime.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService  {
    @Autowired
    CustomerRepository customerRepository;
    //getting all customer records
    public List<Customer> getAllCustomer()
    {
        List<Customer> customers = new ArrayList<Customer>();
        customerRepository.findAll().forEach(customer -> customers.add(customer));
        return customers;
    }
    //getting a specific record
    public Customer getCustomerById(int id){
        return customerRepository.findById(id).get();
    }

/*   public void saveOrUpdate(Customer customer)
    {
        customerRepository.save(customer);
    }*/
 /*public Customer saveOrUpdate(Customer customer){
      return
              customerRepository.save
                      (customer);

  }  */

public List<Customer> saveOrUpdate(List<Customer> customers){
        return customerRepository.saveAll(customers);
    }
    //deleting a specific record
    public void delete(int id)
    {
        customerRepository.deleteById(id);
    }

}
