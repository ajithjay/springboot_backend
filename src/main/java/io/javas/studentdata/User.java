package io.javas.studentdata;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;






@Document(collection="users")
@Data
@NoArgsConstructor
@AllArgsConstructor




//schema/model
public class User {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    
    private int id;

    @NotNull(message = "name cannot be null")
    @NotBlank(message = "name cannot not be blank")
    private String name;

    @NotNull(message = "date cannot be null")
    @NotBlank(message = "name cannot not be blank")
    private String date;

    @NotNull(message = "classes cannot be null")
    @NotBlank(message = "name cannot not be blank")
    private String classes;

    @NotNull(message = "division cannot be null")
    @NotBlank(message = "name cannot not be blank")
    private String division;

    @NotNull(message = " gender name cannot be null")
    @NotBlank(message = "name cannot not be blank")
    private String gender;

    
}


