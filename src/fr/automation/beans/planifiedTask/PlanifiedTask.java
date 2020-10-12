package fr.automation.beans.planifiedTask;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Object that is a planified task
 */
public class PlanifiedTask
{

    public LocalDateTime getPlanifiedDate() {
        return planifiedDate;
    }
    // The planified date the task is supposed to happen
    private final LocalDateTime planifiedDate;
    // The planified frequency the user wants the task occurs
    private final FrequencyTask frequency;
    // The planified duration of the task
    private final Duration durationTask;
    public PlanifiedTask(LocalDateTime planifiedHour, FrequencyTask frequency, Duration durationtask)
    {
        this.planifiedDate = planifiedHour;
        this.frequency = frequency;
        this.durationTask = durationtask;
    }
}
