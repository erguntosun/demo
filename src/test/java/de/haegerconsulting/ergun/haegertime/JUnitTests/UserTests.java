package de.haegerconsulting.ergun.haegertime.JUnitTests;

import de.haegerconsulting.ergun.haegertime.model.Customer;
import de.haegerconsulting.ergun.haegertime.model.User;
import de.haegerconsulting.ergun.haegertime.repository.CustomerRepository;
import de.haegerconsulting.ergun.haegertime.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserTests {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser() {
        User user = new User();

        user.setId(22);
        user.setUsername("etsn");
        user.setPassword("1234");
        user.setLastName("Tosun");
        user.setFirstName("Ergun");
        user.setAddress("Herrstr11 Bonn");
        user.setRole("ADMIN");


        User savedUser = repo.save(user);

        User existUser = entityManager.find(User.class, savedUser.getId());

        assertThat(existUser.getUsername()).isEqualTo(user.getUsername());
    }
    @Test
    public void testDeleteUser() {
        int id = 2;
        boolean existUser = repo.findById(id).isPresent();
        repo.deleteById(id);
        boolean deletedUser = repo.findById(id).isPresent();
        Assertions.assertTrue(existUser);
        Assertions.assertFalse(deletedUser);
    }
    @Test
    public void testListUser(){
        List<User> users = repo.findAll();
        for (User user : users){
            System.out.println(user);
        }
        assertThat(users).size().isGreaterThan(0);
    }

}