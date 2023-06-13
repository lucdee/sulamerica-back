package com.example.sulamerica.mapper;

import com.example.sulamerica.entity.Sector;
import com.example.sulamerica.model.SectorDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SectorMapper {

    Sector map(SectorDTO sectorDTO);

    SectorDTO map(Sector sector);
}
