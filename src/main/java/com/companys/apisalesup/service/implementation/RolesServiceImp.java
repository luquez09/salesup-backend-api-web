package com.companys.apisalesup.service.implementation;

import com.companys.apisalesup.dto.RoleDto;
import com.companys.apisalesup.mapper.RolesMapper;
import com.companys.apisalesup.repository.RolesRepository;
import com.companys.apisalesup.service.RolesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class RolesServiceImp implements RolesService {

    private RolesRepository rolesRepository;

    @Override
    public RoleDto createRoles(RoleDto roles) {
        return RolesMapper.mapToRoleDto(rolesRepository.save(RolesMapper.mapToRole(roles)));
    }

    @Override
    public List<RoleDto> listRoles() {
        return rolesRepository.findAll().stream().map((RolesMapper::mapToRoleDto)).toList();
    }

    @Override
    public void deleteRole(Integer roleId) {
        rolesRepository.deleteById(roleId);
    }
}
