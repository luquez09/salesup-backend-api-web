package com.companys.apisalesup.mapper;

import com.companys.apisalesup.dto.RoleDto;
import com.companys.apisalesup.entity.Roles;


public class RolesMapper {

    public static Roles mapToRole(RoleDto roleDto) {
         return new Roles(
                 roleDto.getIdRole(),
                 roleDto.getRoleName()
         );
    }

    public static RoleDto mapToRoleDto(Roles roleDto) {
        return new RoleDto(
                roleDto.getIdRoles(),
                roleDto.getRoleName()
        );
    }

}
