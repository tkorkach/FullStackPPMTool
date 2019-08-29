package io.spring.ppmtool.repositories;

import io.spring.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Override
    Optional<Project> findById(Long aLong);
}
