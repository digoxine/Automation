package fr.automation.beans.planifiedTask;
import java.time.Duration;
import java.time.LocalDateTime;

public class WashingMachinePlanifiedTask extends PlanifiedTask
{
    public int getOperatingTemperature() {
        return operatingTemperature;
    }

    private final int operatingTemperature;
    public WashingMachinePlanifiedTask(LocalDateTime planifiedHour, FrequencyTask frequency, Duration durationtask, int operatingTemperature) {
        super(planifiedHour, frequency, durationtask);
        this.operatingTemperature = operatingTemperature;
    }

}
