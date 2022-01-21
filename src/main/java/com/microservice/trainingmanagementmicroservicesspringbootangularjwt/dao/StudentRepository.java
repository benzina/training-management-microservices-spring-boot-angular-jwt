package com.microservice.trainingmanagementmicroservicesspringbootangularjwt.dao;

import com.microservice.trainingmanagementmicroservicesspringbootangularjwt.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student,Long> {
   /* @Query("select s from Student s where s.firstName like :x")
    public List<Student> searchStudent(@Param("x") String firstName);
    */
    public List<Student> findFirstByFirstName(String firstName);
}
