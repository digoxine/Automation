package fr.automation.components.interfaces.consumer.controllable;

public interface FridgeManagementUserImplementationI {
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
     * decrease temperature
     * @param degrees       the user wants to decrease the requested temperature
     */
    public void decreaseRequestedTemperature(int degrees) throws Exception;

    /**
     * increase
     * @param degrees       the user wants to increase the requested temperature
     */
    public void increaseRequestedTemperature(int degrees) throws Exception;

    /**
     * The user can open the door for time in second
     * @param time          time the door is open (in seconds)
     */
    public void openDoor(int time) throws Exception;
}
