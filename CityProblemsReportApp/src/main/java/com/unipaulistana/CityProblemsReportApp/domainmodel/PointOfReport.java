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
@Table(indexes = {
        @Index(name = "IDX_POST", columnList = "post"),
        @Index(name = "IDX_POINTOFREPORTTAG", columnList = "pointOfReportTag"),
        @Index(name = "IDX_CEP", columnList = "CEP"),
        @Index(name = "IDX_ADRESS", columnList = "adress")
})
public class PointOfReport extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false, updatable = false)
    private UUID id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 200)
    private String description;

    @Column(nullable = false, length = 8)
    private String CEP;

    @Column(nullable = false, length = 35)
    private String adress;

    @Column(nullable = false, length = 5)
    private String adress_number;

    @Column(nullable = false, length = 30)
    private String city;

    @Column(nullable = false, length = 25)
    private String state;

    @Column(nullable = false, length = 25)
    private String country;

     private Double latitude;

    private Double longitude;

    @OneToOne
    //@JoinColumn(name = "PointOfReportID")
    private Post post; //Perfil que criou o POR: OneToOne

    @OneToOne
    private PointOfReport_Tag pointOfReportTag;     //Lista de tags do ponto de report: OneToOne

    //Getters and setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public PointOfReport_Tag getPointOfReportTag() {
        return pointOfReportTag;
    }

    public void setPointOfReportTag(PointOfReport_Tag pointOfReportTag) {
        this.pointOfReportTag = pointOfReportTag;
    }
}
