package com.microservice.trainingmanagementmicroservicesspringbootangularjwt.projection;

import com.microservice.trainingmanagementmicroservicesspringbootangularjwt.Model.Student;
import com.microservice.trainingmanagementmicroservicesspringbootangularjwt.Model.Training;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1",types = {Student.class})
public interface StudentProjection {
    public String getFirstName();
    public Training getTraining();

}
