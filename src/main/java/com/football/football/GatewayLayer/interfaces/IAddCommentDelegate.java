package com.football.football.GatewayLayer.interfaces;

import com.football.football.ControllerLayer.Models.MatchComment;

public interface IAddCommentDelegate {
    boolean addComment(MatchComment comment);
}
