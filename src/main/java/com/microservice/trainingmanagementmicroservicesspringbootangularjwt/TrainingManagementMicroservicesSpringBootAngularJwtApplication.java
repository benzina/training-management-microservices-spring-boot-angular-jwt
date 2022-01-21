package com.microservice.trainingmanagementmicroservicesspringbootangularjwt;

import com.microservice.trainingmanagementmicroservicesspringbootangularjwt.Model.Student;
import com.microservice.trainingmanagementmicroservicesspringbootangularjwt.Model.Training;
import com.microservice.trainingmanagementmicroservicesspringbootangularjwt.dao.StudentRepository;
import com.microservice.trainingmanagementmicroservicesspringbootangularjwt.dao.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class TrainingManagementMicroservicesSpringBootAngularJwtApplication implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TrainingRepository trainingRepository;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;



    public static void main(String[] args) {
        SpringApplication.run(TrainingManagementMicroservicesSpringBootAngularJwtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        /* for display each object id in json file*/
        repositoryRestConfiguration.exposeIdsFor(Training.class, Student.class);

        Training training1=trainingRepository.save(new Training(null,"Genie Informatique",3,null));
        Training training2=trainingRepository.save(new Training(null,"Qualite Logiciel",3,null));
        Training training3=trainingRepository.save(new Training(null,"Mathematiques fondamentales",3,null));

        studentRepository.save(new Student(null,"safaa","benzina",new Date(),training1));
        studentRepository.save(new Student(null,"said","benzina",new Date(),training2));
        studentRepository.save(new Student(null,"sara","benzina",new Date(),training3));
        studentRepository.save(new Student(null,"naime","benzina",new Date(),training1));

    }
}
