package answersToInterview.dependencyInjection.classes;

import answersToInterview.dependencyInjection.interfaces.ICar;
import answersToInterview.dependencyInjection.interfaces.IEngine;

public class DefaultImplCar implements ICar {
    private final IEngine engine;
    public DefaultImplCar(IEngine engineImpl) {
        this.engine = engineImpl;
    }

    @Override
    public float getSpeed() {
        return engine.getEngineRotation()*1000;
    }

    @Override
    public void setPedalPressure(final float PEDAL_PRESSURE) {
        engine.setFuelConsumptionRate(PEDAL_PRESSURE);
    }
}
