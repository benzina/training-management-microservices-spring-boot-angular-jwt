package com.microservice.trainingmanagementmicroservicesspringbootangularjwt.Model;

import com.microservice.trainingmanagementmicroservicesspringbootangularjwt.Model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data@AllArgsConstructor @NoArgsConstructor
public class Training implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTraining;
    private String name;
    private int duration;
    @OneToMany(mappedBy = "training")
    private Collection<Student> students;
}
