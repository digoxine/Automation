package fr.automation.components.interfaces.consumer.controllable;

import fr.automation.beans.planifiedTask.WashingMachinePlanifiedTask;

public interface WashingMachineManagementControllerImplementationI {
    /**
     *
     * @return              true if the washingMachine is currently working
     * @throws Exception
     */
    public boolean getStateWashingMachine() throws Exception;

    /**
     * switch on the device
     * @throws Exception
     */
    public void switchOnWashingMachine(int operating_temperature) throws Exception;

    /**
     * switch off the device
     * @throws Exception
     */
    public void switchOffWashingMachine() throws Exception;

    public void planifyWashing(WashingMachinePlanifiedTask planifiedTask, String inboundPortURI) throws Exception;

}
