package com.football.football.ControllerLayer;

import com.football.football.ControllerLayer.Models.MatchComment;
import com.football.football.GatewayLayer.implementation.AddCommentDelegate;
import com.football.football.GatewayLayer.implementation.GetDetailsDelegate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.Map;

@RestController
@RequestMapping("/football/liveToWatch/v3")
public class ExposeExternalEndpoint {

    @Inject
    private GetDetailsDelegate getDetailsDelegate;

    @Inject
    private AddCommentDelegate addCommentDelegate;

    @GetMapping("/getMatchDetails")
    public ResponseEntity<?> getMatchDetails() {
        return ResponseEntity.ok(getDetailsDelegate.getDetails());
    }

    @PostMapping("/addComment")
    public ResponseEntity<?> addComment(@RequestBody MatchComment comment) {
        boolean success = addCommentDelegate.addComment(comment);
        if (success) {
            return ResponseEntity.ok(Map.of("Message:", "Comment added successfully"));
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add comment");
        }
    }

}
