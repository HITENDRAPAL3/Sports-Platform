package com.football.football.GatewayLayer.Mappers;

import com.football.football.ControllerLayer.Models.MatchComment;
import com.football.football.DomainLayer.DTO.MatchCommentDTOs.MatchCommentDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IMapMatchCommentToMatchCommentDTO {
    MatchCommentDTO map(MatchComment matchComment);
}
