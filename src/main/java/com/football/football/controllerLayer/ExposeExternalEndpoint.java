package com.football.football.controllerLayer;

import com.football.football.gatewayLayer.implementation.AddCommentDelegate;
import com.football.football.gatewayLayer.implementation.GetDetailsDelegate;
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
    public ResponseEntity<?> addComment(@RequestParam String comment) {
        boolean success = addCommentDelegate.addComment(comment);
        if (success) {
            return ResponseEntity.ok(Map.of("Message:", "Comment added successfully"));
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add comment");
        }

    }

}
