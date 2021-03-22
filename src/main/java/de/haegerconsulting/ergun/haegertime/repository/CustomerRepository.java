package de.haegerconsulting.ergun.haegertime.repository;

import de.haegerconsulting.ergun.haegertime.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository
        <Customer,Integer> {
}
