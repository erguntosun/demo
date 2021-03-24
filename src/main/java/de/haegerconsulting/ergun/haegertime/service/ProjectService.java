package de.haegerconsulting.ergun.haegertime.service;

import de.haegerconsulting.ergun.haegertime.model.Customer;
import de.haegerconsulting.ergun.haegertime.model.Project;
import de.haegerconsulting.ergun.haegertime.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    @Autowired
    ProjectRepository projectRepository;
    //getting all project records
    public List<Project> getAllProject()
    {
        List<Project> projects = new ArrayList<Project>();
        projectRepository.findAll().forEach(project -> projects.add(project));

        return projects;
    }
    //getting a specific record
    public Project getPorjectById(int id){
        return projectRepository.findById(id).get();
    }


 /* public Project saveOrUpdate(Project project){
      return
              projectRepository.save
                      (project);
  }*/
 public List<Project> saveOrUpdate(List<Project> projects){
     return projectRepository.saveAll(projects);
 }
    //deleting a specific record
    public void delete(int id)
    {
        projectRepository.deleteById(id);
    }

}
