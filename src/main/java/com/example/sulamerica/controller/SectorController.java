package com.example.sulamerica.controller;

import com.example.sulamerica.model.SectorDTO;
import com.example.sulamerica.service.SectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/sector")
public class SectorController {

    private final SectorService service;

    @PostMapping()
    public ResponseEntity<SectorDTO> save(@RequestBody SectorDTO sectorDTO){
        return ResponseEntity.ok(service.save(sectorDTO));
    }



}
