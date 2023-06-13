package com.example.sulamerica.repository;

import com.example.sulamerica.entity.Collaborator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CollaboratorRepository extends JpaRepository<Collaborator, Integer> {

    List<Collaborator> findBySectorId(Integer sector);
}
