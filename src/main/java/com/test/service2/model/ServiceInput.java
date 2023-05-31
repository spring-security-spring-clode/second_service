package com.test.service2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "service_inputs")
public class ServiceInput {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String serviceName;

    private String serviceInput;
}
