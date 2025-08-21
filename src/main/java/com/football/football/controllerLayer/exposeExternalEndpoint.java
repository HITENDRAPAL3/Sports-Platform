package com.football.football.controllerLayer;

import com.football.football.gatewayLayer.implementation.AddCommentDelegate;
import com.football.football.gatewayLayer.implementation.GetDetailsDelegate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
@RequestMapping("/football/liveTwoWatch/v3")
public class exposeExternalEndpoint {

    @Inject
    private GetDetailsDelegate getDetailsDelegate;

    @Inject
    private AddCommentDelegate addCommentDelegate;

    @GetMapping("/getMatchDetails")
    public ResponseEntity<String> getMatchDetails() {
        return ResponseEntity.ok(getDetailsDelegate.getDetails());
    }

    @PostMapping("/addComment")
    public ResponseEntity<String> addComment(@RequestParam String comment) {
        addCommentDelegate.addComment(comment);
        return ResponseEntity.ok("Comment added successfully");
    }

}
