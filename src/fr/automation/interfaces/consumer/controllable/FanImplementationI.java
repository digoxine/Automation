package fr.automation.interfaces.consumer.controllable;

import fr.automation.beans.LevelFan;

public interface FanImplementationI
{
    /**
     * Setup the fan with a particular level
     * @param level         level of fan
     * @throws Exception
     */
    public void switchOnFan(LevelFan level) throws Exception;

    /**
     * Change the fan speed with a particular speed
     * @param level             speed
     * @throws Exception
     */
    public void changeLevelFan(LevelFan level) throws Exception;

    /**
     * Switch off the fan
     * @throws Exception
     */
    public void switchOffFan() throws Exception;
}
