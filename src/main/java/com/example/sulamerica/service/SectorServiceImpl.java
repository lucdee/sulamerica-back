package com.example.sulamerica.service;

import com.example.sulamerica.mapper.SectorMapper;
import com.example.sulamerica.model.SectorDTO;
import com.example.sulamerica.repository.SectorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SectorServiceImpl implements SectorService {

    private final SectorRepository sectorRepository;

    private final SectorMapper sectorMapper;

    @Override
    public SectorDTO save(SectorDTO sectorDTO) {
        sectorRepository.save(sectorMapper.map(sectorDTO));
        return sectorDTO;
    }
}
