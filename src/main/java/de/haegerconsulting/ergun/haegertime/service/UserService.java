package de.haegerconsulting.ergun.haegertime.service;

import de.haegerconsulting.ergun.haegertime.model.Customer;
import de.haegerconsulting.ergun.haegertime.model.User;
import de.haegerconsulting.ergun.haegertime.repository.CustomerRepository;
import de.haegerconsulting.ergun.haegertime.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository ;
    //getting all user records
    public List<User> getAllUser()
    {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }
    //getting a specific record
    public User getUserById(int id){
        return userRepository.findById(id).get();
    }



public List<User> saveOrUpdate(List<User> users){
        return userRepository.saveAll(users);
    }
    //deleting a specific record
    public void delete(int id)
    {
        userRepository.deleteById(id);
    }

}
