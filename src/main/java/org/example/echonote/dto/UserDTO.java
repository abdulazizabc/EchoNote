package org.example.echonote.dto;

import lombok.Data;
import org.example.echonote.model.enums.RoleType;

@Data
public class UserDTO {

    private String name;

    private String username;

    private String email;

    private RoleType role;

    private Integer age;

}
