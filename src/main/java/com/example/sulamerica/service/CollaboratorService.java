package com.example.sulamerica.service;

import com.example.sulamerica.model.CollaboratorDTO;

import java.util.List;

public interface CollaboratorService {

    CollaboratorDTO save(Integer setorId,CollaboratorDTO collaboratorDTO);

    List<CollaboratorDTO> findAll();

    CollaboratorDTO findById(Integer collaboratorId);

    List<CollaboratorDTO> findBySector(Integer sectorId);

    CollaboratorDTO deleteById(Integer collaboratorId);

}
