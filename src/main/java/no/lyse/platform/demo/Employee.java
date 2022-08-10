package no.lyse.platform.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Employee {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String name;

    @JsonProperty
    private Long age;

    @JsonProperty
    private String location;

    @JsonProperty
    private String email;

    @JsonProperty
    private String department;
}
