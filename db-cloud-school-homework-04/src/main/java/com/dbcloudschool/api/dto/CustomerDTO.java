package com.dbcloudschool.api.dto;

import lombok.Data;

@Data
public class CustomerDTO {
    private Integer id;
    private String name;
    private String username;
    private String email;
}
