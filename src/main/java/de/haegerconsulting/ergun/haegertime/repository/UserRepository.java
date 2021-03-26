package de.haegerconsulting.ergun.haegertime.repository;

import de.haegerconsulting.ergun.haegertime.model.Customer;
import de.haegerconsulting.ergun.haegertime.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository
        <User,Integer> {
    User deleteById(User user);
}
