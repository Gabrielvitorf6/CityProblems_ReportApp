package com.unipaulistana.CityProblemsReportApp.domainmodel;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "TBL_USER", indexes = {@Index(name = "IDX_USERNAMEPASSWORD", columnList = "username , password"),
@Index(name = "IDX_EMAIL", columnList = "email"),
@Index(name = "IDX_PASSWORD", columnList = "password"),@Index(name = "IDX_PHONE", columnList = "phone"),
@Index(name = "IDX_CPF", columnList = "cpf")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private UUID id;

    @Column(name = "USERNAME",  nullable = false,  unique = true)
    private String username;

    @Column(name = "PASSWORD",  nullable = false, length = 20)
    private String password;

    @Column(name = "EMAIL",   nullable = false, length = 60)
    private String email;

    @Column(name = "PHONE",   nullable = false)
    private String phone;

    @Column(name = "CPF",    nullable = false,   unique = true)
    private String cpf;

    private String adress;
    private String adress_number;
    private String city;
    private String state;
    private String country;
    private String CEP;

    @OneToMany
    private Set<User_Tag> userTag;

    @OneToOne
    private List<Decorations> decorationsList;

    @OneToOne
    private Set<User_profile> profile;

    @OneToMany
    private Set<User_Points> userPoints;

    @OneToMany
    private List<Audit_User> auditUser;

    @OneToMany
    private List<Audit_UserPoints> auditUserPoints;

    @OneToMany
    private List<Audit_Report> auditReports;


    //Getters e Setters


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

    public Set<User_Tag> getUserTag() {
        return userTag;
    }

    public void setUserTag(Set<User_Tag> userTag) {
        this.userTag = userTag;
    }

    public List<Decorations> getDecorationsList() {
        return decorationsList;
    }

    public void setDecorationsList(List<Decorations> decorationsList) {
        this.decorationsList = decorationsList;
    }

    public Set<User_profile> getProfile() {
        return profile;
    }

    public void setProfile(Set<User_profile> profile) {
        this.profile = profile;
    }

    public Set<User_Points> getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(Set<User_Points> userPoints) {
        this.userPoints = userPoints;
    }

    public List<Audit_User> getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(List<Audit_User> auditUser) {
        this.auditUser = auditUser;
    }

    public List<Audit_UserPoints> getAuditUserPoints() {
        return auditUserPoints;
    }

    public void setAuditUserPoints(List<Audit_UserPoints> auditUserPoints) {
        this.auditUserPoints = auditUserPoints;
    }

    public List<Audit_Report> getAuditReports() {
        return auditReports;
    }

    public void setAuditReports(List<Audit_Report> auditReports) {
        this.auditReports = auditReports;
    }
}
