package com.football.football.GatewayLayer.interfaces;

import com.football.football.ControllerLayer.Models.MatchComment;
import com.football.football.ControllerLayer.Models.MatchEvent;

public interface IAddCommentDelegate {
    boolean addComment(MatchComment comment);
    boolean addEvent(MatchEvent event);
}
