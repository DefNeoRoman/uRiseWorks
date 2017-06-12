package answersToInterview.dependencyInjection.classes;

import answersToInterview.dependencyInjection.interfaces.IEngine;

public class DefaultEngineImpl implements IEngine {
    private float engineRotation = 0;
    @Override
    public float getEngineRotation() {
        return engineRotation;
    }

    @Override
    public void setFuelConsumptionRate(float FUEL_FLOW) {
        engineRotation = (engineRotation + 1 + FUEL_FLOW)*50; // Простая формула для получения оборотов двигателя
    }
}
