package com.football.football.DomainLayer.DTO.MatchEventDTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AdditionalInfoDTO {
    private String substitutionFor;
    private String substitutionType;
}