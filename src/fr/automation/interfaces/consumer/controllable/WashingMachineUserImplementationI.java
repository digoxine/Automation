package fr.automation.interfaces.consumer.controllable;

import fr.automation.beans.planifiedTask.FrequencyTask;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Contains all methods the user will call to interacts with its Washing Machine
 */
public interface WashingMachineUserImplementationI {
    /**
     * planify washing. The user will require this method from the WashingMachine component
     * @param planifiedHour             hour we want to trigger the washing machine
     * @param frequency                 frequency of the task
     * @param durationtask              duration of the task
     * @param operatingTemperature      temperature of water during washing
     * @throws Exception
     */
    public void planifyTaskWashingMachine(LocalDateTime planifiedHour, FrequencyTask frequency, Duration durationtask, int operatingTemperature, String URI) throws Exception;
}
