package com.example.authapi.repository;

import com.example.authapi.entity.UserLoginAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginAuditRepository extends JpaRepository<UserLoginAudit, Long> {

}
