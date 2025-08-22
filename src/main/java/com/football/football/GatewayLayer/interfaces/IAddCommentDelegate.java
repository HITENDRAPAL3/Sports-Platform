package com.football.football.GatewayLayer.interfaces;

import com.football.football.DomainLayer.DTO.MatchCommentDTOs.MatchCommentDTO;

public interface IAddCommentDelegate {
    boolean addComment(MatchCommentDTO comment);
}
