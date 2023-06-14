package com.example.sulamerica.service;

import com.example.sulamerica.entity.Collaborator;
import com.example.sulamerica.entity.Sector;
import com.example.sulamerica.mapper.CollaboratorMapper;
import com.example.sulamerica.mapper.SectorMapper;
import com.example.sulamerica.model.CollaboratorDTO;
import com.example.sulamerica.repository.CollaboratorRepository;
import com.example.sulamerica.repository.SectorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CollaboratorServiceImpl implements CollaboratorService{

   private final CollaboratorRepository repository;

   private final SectorRepository sectorRepository;

   private final SectorMapper sectorMapper;

   private final CollaboratorMapper collaboratorMapper;

    @Override
    public CollaboratorDTO save(Integer setorId,CollaboratorDTO collaboratorDTO) {

       Optional<Sector> sector = sectorRepository.findById(setorId);

       collaboratorDTO.setSector(sectorMapper.map(sector.get()));
       repository.save(collaboratorMapper.map(collaboratorDTO));

       return collaboratorDTO;

    }

    @Override
    public List<CollaboratorDTO> findAll() {
      return collaboratorMapper.map(repository.findAll());
    }

    @Override
    public CollaboratorDTO findById(Integer collaboratorId) {
    Optional<Collaborator> collaborator = repository.findById(collaboratorId);
     return collaboratorMapper.map(collaborator.get());
    }

    @Override
    public List<CollaboratorDTO> findBySector(Integer sectorId) {

      return collaboratorMapper.map(repository.findBySectorId(sectorId));

    }

    @Override
    public CollaboratorDTO deleteById(Integer collaboratorId) {
        repository.deleteById(collaboratorId);
        return null;
    }
}
