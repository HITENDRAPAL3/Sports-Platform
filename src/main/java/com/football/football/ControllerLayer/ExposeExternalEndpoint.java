package com.football.football.ControllerLayer;

import com.football.football.ControllerLayer.Models.MatchComment;
import com.football.football.ControllerLayer.Models.MatchEvent;
import com.football.football.ControllerLayer.Models.MatchScoreDetails;
import com.football.football.GatewayLayer.implementation.AddCommentsAndEventsDelegate;
import com.football.football.GatewayLayer.implementation.MatchDetailsDelegate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.Map;

@RestController
@RequestMapping("/football/liveToWatch/v3")
@CrossOrigin(origins = "*")
public class ExposeExternalEndpoint {

    @Inject
    private MatchDetailsDelegate matchDetailsDelegate;

    @Inject
    private AddCommentsAndEventsDelegate addCommentsAndEventsDelegate;

    // for CRUD operations
    @GetMapping("/getMatchDetails")
    public ResponseEntity<?> getMatchDetails(@RequestParam Long matchId) {
        return ResponseEntity.ok(matchDetailsDelegate.getDetails(matchId));
    }

    @PostMapping("/addMatchDetails")
    public ResponseEntity<?> addMatchDetails(@RequestBody MatchScoreDetails matchScoreDetails) {
        matchDetailsDelegate.addDetails(matchScoreDetails);
        return ResponseEntity.ok("Match Details added successfully");
    }

    // for external events
    @PostMapping("/addComment")
    public ResponseEntity<?> addComment(@RequestBody MatchComment comment) {
        boolean success = addCommentsAndEventsDelegate.addComment(comment);
        if (success) {
            return ResponseEntity.ok(Map.of("Message:", "Comment added successfully"));
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add comment");
        }
    }

    @PostMapping("/addMatchEvent")
    public ResponseEntity<?> addMatchEvent(@RequestBody MatchEvent event) {
        boolean success = addCommentsAndEventsDelegate.addEvent(event);
        if (success) {
            return ResponseEntity.ok(Map.of("Message:", "Event added successfully"));
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add comment");
        }
    }

}
