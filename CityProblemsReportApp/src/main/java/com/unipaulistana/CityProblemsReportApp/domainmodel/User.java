package com.unipaulistana.CityProblemsReportApp.domainmodel;
import com.unipaulistana.CityProblemsReportApp.domainmodel.audit.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TBL_USER", indexes = {@Index(name = "IDX_USERNAMEPASSWORD", columnList = "username , password"),
        @Index(name = "IDX_EMAIL", columnList = "email"),
        @Index(name = "IDX_PASSWORD", columnList = "password"),
        @Index(name = "IDX_EMAIL", columnList = "email"),
        @Index(name = "IDX_CPF", columnList = "CPF")
})
public class User extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false)
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

    private Set<User_profile> profile; //perfil do user : onetoone com userprofile
    private Set<User_Points> userPoints; //quantidade de pontos do usuário : OnetoMany


}