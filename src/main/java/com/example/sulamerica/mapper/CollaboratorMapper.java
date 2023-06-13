package com.example.sulamerica.mapper;

import com.example.sulamerica.entity.Collaborator;
import com.example.sulamerica.model.CollaboratorDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CollaboratorMapper {

    Collaborator map(CollaboratorDTO collaboratorDTO);

    CollaboratorDTO map(Collaborator collaborator);

    List<CollaboratorDTO> map(List<Collaborator> collaborator);
}
