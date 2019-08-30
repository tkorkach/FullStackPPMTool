package io.spring.ppmtool.services;

import io.spring.ppmtool.domain.Project;
import io.spring.ppmtool.exceptions.ProjectIdException;
import io.spring.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        try {
            project.getProjectIdentifier().toUpperCase();
            return projectRepository.save(project);
        } catch (Exception e) {
            throw new ProjectIdException("Project ID " + project.getProjectIdentifier().toUpperCase() + " already exists");
        }
    }
}
