package com.codnect.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Burak Köken on 12.7.2017.
 */
public class PersonForm {

    @NotNull(message = "The name field must not empty!")
    @Size(min = 3, max = 20)
    private String name;

    @NotNull
    @Min(18)
    @Max(35)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
