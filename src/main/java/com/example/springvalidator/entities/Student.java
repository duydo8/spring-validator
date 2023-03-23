package com.example.springvalidator.entities;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @NotNull(message = "id can't be null")
    private Integer id;
    @NotNull(message = "name can't be null")
    private String name;

}
