package de.haegerconsulting.ergun.haegertime.JUnitTests;

import de.haegerconsulting.ergun.haegertime.model.Customer;
import de.haegerconsulting.ergun.haegertime.model.Project;
import de.haegerconsulting.ergun.haegertime.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import org.springframework.util.Assert;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class ProjectTests {

    @Autowired
    private ProjectRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateProject(){
        Project project= new Project();
        project.setId(001);
        project.setCustomer("Ali");
        project.setTitel("Herr");
        project.setStartdate("11.11.2021");
        project.setEnddate("11.11.2022");

        Project saveProject =repo.save(project);
        Project existProject = entityManager.find(Project.class, saveProject.getId());
        assertThat(existProject.getCustomer()).isEqualTo(project.getCustomer());







    }
}
