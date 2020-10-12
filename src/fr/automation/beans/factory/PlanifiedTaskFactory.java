package fr.automation.beans.factory;

import fr.automation.beans.planifiedTask.FrequencyTask;
import fr.automation.beans.planifiedTask.WashingMachinePlanifiedTask;

import java.time.Duration;
import java.time.LocalDateTime;

public class PlanifiedTaskFactory implements IPlanifiedTaskFactory
{
    @Override
    public WashingMachinePlanifiedTask newWashingMachineTask(LocalDateTime timeScheduled, FrequencyTask frequency, Duration durationTask, int operatingTemperature) {
        return new WashingMachinePlanifiedTask(timeScheduled,frequency,durationTask,operatingTemperature);
    }
}
