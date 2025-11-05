package com.companys.apisalesup.service;


import com.companys.apisalesup.dto.RoleDto;
import com.companys.apisalesup.entity.Roles;

import java.util.List;

public interface RolesService {

    RoleDto createRoles(RoleDto roles);
    List<RoleDto> listRoles();
    void deleteRole(Integer roleId);

}
