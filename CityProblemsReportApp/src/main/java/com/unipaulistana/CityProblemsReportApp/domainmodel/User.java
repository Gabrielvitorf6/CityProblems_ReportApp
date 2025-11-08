package com.unipaulistana.CityProblemsReportApp.domainmodel;
import com.unipaulistana.CityProblemsReportApp.audit.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(indexes = {@Index(name = "IDX_USERNAMEPASSWORD", columnList = "username , password"),
        @Index(name = "IDX_EMAIL", columnList = "email"),
        @Index(name = "IDX_PASSWORD", columnList = "password"),
        @Index(name = "IDX_EMAIL", columnList = "email"),
        @Index(name = "IDX_CPF", columnList = "cpf")
})
public class User extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false, updatable = false)
    private UUID id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phone;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false, length = 50)
    private String adress;

    @Column(nullable = false, length = 5)
    private String adress_number;

    @Column(nullable = false, length = 50)
    private String city;

    @Column(nullable = false, length = 50)
    private String state;

    @Column(nullable = false, length = 35)
    private String country;

    @Column(nullable = false, length = 8)
    private String CEP;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private User_profile userProfile; //perfil do user : onetoone com userprofile
    }