package com.example.sulamerica.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class SectorDTO {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("descricao")
    private String descricao;
}
