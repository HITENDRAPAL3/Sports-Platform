package com.football.football.controllerLayer;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.football.football.gatewayLayer.implementation.GetDetailsDelegate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.Map;

@RestController
@RequestMapping("/football/liveTwoWatch/v3")
public class exposeExternalEndpoint {

    @Inject
    private GetDetailsDelegate getDetailsDelegate;

    @GetMapping("/getMatchDetails")
    public ResponseEntity<String> getMatchDetails() {
        return ResponseEntity.ok(getDetailsDelegate.getDetails());
    }

}
