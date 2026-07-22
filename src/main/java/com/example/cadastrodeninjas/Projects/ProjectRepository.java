package com.example.cadastrodeninjas.Projects;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectModel, Long> { //Permite interagir com o banco de dados

}
