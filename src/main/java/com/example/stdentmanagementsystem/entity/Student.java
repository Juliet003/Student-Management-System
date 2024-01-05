package com.example.stdentmanagementsystem.entity;

import com.example.stdentmanagementsystem.enums.Gender;
import com.example.stdentmanagementsystem.enums.Roles;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "student")
public class Student {
    @jakarta.persistence.Id
    @Id
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @Column
    private String address;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "roles", nullable = false)
    @Enumerated(EnumType.STRING)
    private Roles role;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

}
