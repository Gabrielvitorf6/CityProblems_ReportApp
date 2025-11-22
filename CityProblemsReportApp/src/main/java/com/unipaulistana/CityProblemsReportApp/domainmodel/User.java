package com.unipaulistana.CityProblemsReportApp.domainmodel;
import com.unipaulistana.CityProblemsReportApp.audit.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
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

    @Column(nullable = false,  updatable = false, length = 8, precision = 8)
    private Date birthdate;

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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress_number() {
        return adress_number;
    }

    public void setAdress_number(String adress_number) {
        this.adress_number = adress_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public User_profile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(User_profile userProfile) {
        this.userProfile = userProfile;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}