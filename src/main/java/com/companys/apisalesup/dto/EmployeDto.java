package com.companys.apisalesup.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeDto {

    private Integer idEmployee;
    private String nameEmployee;
    private String phoneEmployee;
    private String passwordEmployee;
    private String userEmployee;
    private String identificationEmployee;
    private Integer idRole;

}
