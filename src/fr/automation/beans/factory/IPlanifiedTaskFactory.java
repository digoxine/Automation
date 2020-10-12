package fr.automation.beans.factory;

import fr.automation.beans.planifiedTask.FrequencyTask;
import fr.automation.beans.planifiedTask.WashingMachinePlanifiedTask;

import java.time.Duration;
import java.time.LocalDateTime;

public interface IPlanifiedTaskFactory
{
    public WashingMachinePlanifiedTask newWashingMachineTask(LocalDateTime timeScheduled, FrequencyTask frequency, Duration durationTask, int operatingTemperature);
}
