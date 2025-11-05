package com.companys.apisalesup.controller;

import com.companys.apisalesup.dto.RoleDto;
import com.companys.apisalesup.service.RolesService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/roles")
public class RolesController {

    private RolesService rolesService;

    @PostMapping(value = "/saveroles")
    public ResponseEntity<RoleDto> createRoles(@RequestBody RoleDto createProduct) {
        RoleDto productsDto = rolesService.createRoles(createProduct);
        return new ResponseEntity<>(productsDto, HttpStatus.CREATED);
    }

    @GetMapping(value = "/findAllRoles")
    public ResponseEntity<List<RoleDto>> findAllRoles() {
        return ResponseEntity.ok(rolesService.listRoles());
    }

        @DeleteMapping
    public ResponseEntity<String> deleteRoles(@RequestParam Integer idRoles) {
        rolesService.deleteRole(idRoles);
        return ResponseEntity.ok("Eliminado Correctamente.");
    }
}
