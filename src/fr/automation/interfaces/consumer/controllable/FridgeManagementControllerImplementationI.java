package fr.automation.interfaces.consumer.controllable;

/**
 * Interface contains every method useful to control the fridge
 */
public interface FridgeManagementControllerImplementationI {
    /**
     * get Requested Temperature
     * @return              get requested temperature
     */
    public int getRequestedTemperature() throws Exception;

    /**
     * get current temperature
     * @return              get current temperature
     */
    public int getCurrentTemperature() throws Exception;

    /**
     * the controller can switch off the cooling system of the fridge
     */
    public void switchOffFridge() throws Exception;

    /**
     * the controller an switch on the cooling system of the fridge
     */
    public void switchOnFridge() throws Exception;

    /**
     * the controller can get the current state of the fridge
     * @return              true if the cooling system is switched on. false otherwise
     */
    public boolean getStateFridge() throws Exception;

    /**
     * The controller can get the current outside temperature (function of the environment)
     * @return              outside temperature
     */
    public float getOutsideTemperature() throws Exception;
}
