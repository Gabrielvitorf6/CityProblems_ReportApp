package com.unipaulistana.CityProblemsReportApp.domainmodel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TBL_USER_PROFILE", indexes = {@Index(name = "IDX_NICKNAME", columnList = "nickname")
})
public class User_profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false, updatable = false)
    private UUID id;

    @Column(name = "NICKNAME",  unique = true, nullable = false)
    private String nickname;

    private String bio;
    private String profilePictureUrl;
    private int Totalupvotes; //joincolumn de post

    private Set<User_Tag> userTag; //tags do perfil : OnetoMany com User_tag
    private List<Decorations> decorationsList; //lista de condecoraões : OneToMany (Essa em especifico puxa o total de condecorções da conta)
    private List<Post> posts; //Posts do perfil : OneToMany
    private Set<User> user; //Usuário do perfil : OneToOne com User
    //Coluna com seguidores e seguindo tem que ser implementada, falar com o professor
}