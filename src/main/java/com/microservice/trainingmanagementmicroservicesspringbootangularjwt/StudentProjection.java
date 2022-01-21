package com.microservice.trainingmanagementmicroservicesspringbootangularjwt;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1",types = {Student.class})
public interface StudentProjection {
    public String getFirstName();
    public Training getTraining();

}
