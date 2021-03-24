package de.haegerconsulting.ergun.haegertime.controller;

import de.haegerconsulting.ergun.haegertime.model.Customer;
import de.haegerconsulting.ergun.haegertime.model.Project;
import de.haegerconsulting.ergun.haegertime.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

   /* @PostMapping("/Project")
    public Project addProject(@RequestBody Project project){
        return projectService.saveOrUpdate(project);
    }*/

    @PostMapping("/Project")
    public List<Project> addProject(@RequestBody List<Project> projects){
        return projectService.saveOrUpdate(projects);
    }

    /*public List<Customer> addCustomers(@RequestBody List<Customer> customers){
        return projectService.saveOrUpdate(customers);
    }*/



    @GetMapping("/Project")
    private List<Project> getAllProject()
    {
        return projectService.getAllProject();

    }

    @GetMapping("/Project/{id}")
    private Project getProject(@PathVariable("id") int id)
    {
                return  projectService.getPorjectById(id);
    }

    //creating a delete mapping that deletes a specific project
    @DeleteMapping("/Project/{id}")
    private void Project(@PathVariable("id") int id)
    {
        projectService.delete(id);
    }



}
