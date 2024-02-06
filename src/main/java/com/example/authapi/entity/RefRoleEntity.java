package com.example.authapi.entity;

import com.example.authapi.model.RoleEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity(name = "Ref_Role")
public class RefRoleEntity {

    @Id
    @GeneratedValue
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_type")
    @Enumerated
    private RoleEnum roleType;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "created_by")
    @CreatedBy
    private String createdBy;

    @Column(name = "created_date")
    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column(name = "updated_by")
    @CreatedBy
    private String updatedBy;

    @Column(name = "updated_date")
    @UpdateTimestamp
    private LocalDateTime updatedDate;
}
