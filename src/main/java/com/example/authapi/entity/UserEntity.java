package com.example.authapi.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "'User'")
@Data
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_first_name")
    private String userFirstName;

    @Column(name = "user_last_name")
    private String userLastName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_contact")
    private String userContact;

    @Column(name = "user_password")
    private String userPassword;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_role")
    private RefRoleEntity userRole;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

}
