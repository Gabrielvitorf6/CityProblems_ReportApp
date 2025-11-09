package com.unipaulistana.CityProblemsReportApp.domainmodel.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User,UUID> {

    public Optional<User> findById(UUID id);
    public Optional<User> findByUsername(String username);
    public Optional<User> findByEmail(String email);
    Optional<User> findByUsernameAndEmail(String username, String email);
    Optional<User> findByCpf(String cpf);
    public Optional<User> findByPhone(String phone);
    public Optional<User> findByAdress(String adress);
    public List<User> findAll = List.of();
    public void deleteById(UUID id);

    public default Optional<User> save(User user) {
        return null;
    }


}
