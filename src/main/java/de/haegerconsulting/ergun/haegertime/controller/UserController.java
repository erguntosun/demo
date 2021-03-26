package de.haegerconsulting.ergun.haegertime.controller;

import de.haegerconsulting.ergun.haegertime.model.Customer;
import de.haegerconsulting.ergun.haegertime.model.User;
import de.haegerconsulting.ergun.haegertime.service.CustomerService;
import de.haegerconsulting.ergun.haegertime.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {
    @Autowired
    private UserService userService;

   /*@PostMapping("/Customer1")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.saveOrUpdate(customer);
    }*/
   @PostMapping("/User")
   public List<User> addUsers(@RequestBody List<User> users){
       return userService.saveOrUpdate(users);
   }

    @GetMapping("/User")
    private List<User> getAllUser()
    {
        return userService.getAllUser();
    }

    @GetMapping("/User/{id}")
    private User getUser(@PathVariable("id") int id)
    {
        return userService.getUserById(id);
    }

    //creating a delete mapping that deletes a specific customer
    @DeleteMapping("/User/{id}")
    private void deleteUser(@PathVariable("id") int id)
    {
        userService.delete(id);
    }


}
