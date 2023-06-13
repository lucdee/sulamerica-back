package com.example.sulamerica.controller;

import com.example.sulamerica.model.CollaboratorDTO;
import com.example.sulamerica.model.SectorDTO;
import com.example.sulamerica.service.CollaboratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/collaborator")
public class CollaboratorController {

    private final CollaboratorService service;

    @PostMapping("/{setorid}")
    public ResponseEntity<CollaboratorDTO> save(
            @PathVariable(value = "setorid") Integer setorid,
            @RequestBody CollaboratorDTO collaboratorDTO){
        return ResponseEntity.ok(service.save(setorid, collaboratorDTO));
    }


    @GetMapping()
    public ResponseEntity<List<CollaboratorDTO>> findAll(){
       return ResponseEntity.ok(service.findAll());
    }


    @DeleteMapping("/{CollaboratorId}")
    public ResponseEntity<CollaboratorDTO> deleteById(
            @PathVariable(value = "CollaboratorId") Integer CollaboratorId
    ){
        return ResponseEntity.ok(service.deleteById(CollaboratorId));
    }

    @GetMapping("/buscar-por-setor/{setorid}")
    public ResponseEntity<List<CollaboratorDTO>> findBySector(
            @PathVariable(value = "setorid") Integer setorid
    ){
        return ResponseEntity.ok(service.findBySector(setorid));
    }

}
