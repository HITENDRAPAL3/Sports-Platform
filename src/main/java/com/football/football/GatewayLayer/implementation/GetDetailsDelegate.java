package com.football.football.GatewayLayer.implementation;

import com.football.football.GatewayLayer.interfaces.IGetDetailsDelegate;
import com.football.football.ServiceLayer.logic.GetDetailsStep;

import javax.inject.Inject;

public class GetDetailsDelegate implements IGetDetailsDelegate {

    @Inject
    private GetDetailsStep getDetailsStep;

    @Override
    public String getDetails() {
        return getDetailsStep.getDetails();
    }

}
