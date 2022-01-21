package com.microservice.trainingmanagementmicroservicesspringbootangularjwt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TrainingRepository extends JpaRepository<Training,Long> {
}
