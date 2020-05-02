package com.sbcompany.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Lombok
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//DB
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    //REST
    @JsonProperty("firstName")
    private String firstname;
    //REST
    @JsonProperty("lastName")
    private String lastname;
}
