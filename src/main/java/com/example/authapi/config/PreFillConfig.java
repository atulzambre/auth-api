package com.example.authapi.config;

import com.example.authapi.entity.RefRoleEntity;
import com.example.authapi.model.RoleEnum;
import com.example.authapi.repository.RefRoleRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PreFillConfig {

    @Autowired
    private RefRoleRepository refRoleRepository;


    @PostConstruct
    public void preFillRefRole() {

        RefRoleEntity refRoleEntity = new RefRoleEntity();
        refRoleEntity.setRoleType(RoleEnum.CUSTOMER);
        refRoleEntity.setIsDeleted(Boolean.FALSE);
        refRoleRepository.save(refRoleEntity);
        refRoleEntity = new RefRoleEntity();
        refRoleEntity.setRoleType(RoleEnum.VENDOR);
        refRoleEntity.setIsDeleted(Boolean.FALSE);
        refRoleRepository.save(refRoleEntity);
        refRoleEntity = new RefRoleEntity();
        refRoleEntity.setRoleType(RoleEnum.ADMIN);
        refRoleEntity.setIsDeleted(Boolean.FALSE);
        refRoleRepository.save(refRoleEntity);

    }
}
