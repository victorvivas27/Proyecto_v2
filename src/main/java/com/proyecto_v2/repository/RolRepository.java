package com.proyecto_v2.repository;

import com.proyecto_v2.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Roles, Long> {
    Optional<Roles> findByRol(String rol);

    boolean existsByRol(String rol);

}
