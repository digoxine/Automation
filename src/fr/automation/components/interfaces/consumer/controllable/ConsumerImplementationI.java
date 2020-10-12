package fr.automation.components.interfaces.consumer.controllable;

/**
 * Contains methods common to all devices that consume energy (no matter whether it is controllable stoppable or static)
 */
public interface ConsumerImplementationI {
    /**
     * the controller can check the current consumption of the fridge (required)
     * @return              current consumption of energy
     */
    public int getConsumption() throws Exception;
}
