package com.microservice.trainingmanagementmicroservicesspringbootangularjwt.dao;

import com.microservice.trainingmanagementmicroservicesspringbootangularjwt.Model.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TrainingRepository extends JpaRepository<Training,Long> {
}
