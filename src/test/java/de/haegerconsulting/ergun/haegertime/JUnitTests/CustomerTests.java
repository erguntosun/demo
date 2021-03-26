package de.haegerconsulting.ergun.haegertime.JUnitTests;

import de.haegerconsulting.ergun.haegertime.model.Customer;
import de.haegerconsulting.ergun.haegertime.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class CustomerTests {

    @Autowired
    private CustomerRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateCustomer() {
        Customer customer = new Customer();

        customer.setCompany("Ergun123 Gmbh");
        customer.setPrename("Ergun123");
        customer.setSurname("Tosun123");

        Customer savedCustomer = repo.save(customer);

        Customer existCustomer = entityManager.find(Customer.class, savedCustomer.getId());

        assertThat(existCustomer.getPrename()).isEqualTo(customer.getPrename());
    }
    @Test
    public void testDeleteCustomer() {
        int id = 2;
        boolean existCustomer = repo.findById(id).isPresent();
        repo.deleteById(id);
        boolean deletedCustomer = repo.findById(id).isPresent();
        Assertions.assertTrue(existCustomer);
        Assertions.assertFalse(deletedCustomer);
    }
    @Test
    public void testListCustomer(){
        List<Customer> customers = repo.findAll();
        for (Customer customer : customers){
            System.out.println(customer);
        }
        assertThat(customers).size().isGreaterThan(0);
    }

}