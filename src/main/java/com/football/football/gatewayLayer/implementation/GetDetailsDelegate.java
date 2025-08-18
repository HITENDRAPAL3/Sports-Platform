package com.football.football.gatewayLayer.implementation;

import com.football.football.gatewayLayer.interfaces.IGetDetailsDelegate;
import com.football.football.serviceLayer.logic.GetDetailsStep;

import javax.inject.Inject;

public class GetDetailsDelegate implements IGetDetailsDelegate {

    @Inject
    private GetDetailsStep getDetailsStep;

    @Override
    public String getDetails() {
        return getDetailsStep.getDetails();
    }

}
