package fr.automation.interfaces.consumer.controllable;

/**
 * Every controlable devices will require these methods
 * The device will require all these methods
 */
public interface ControllableImplementationI extends ConsumerImplementationI{
    /**
     * the fridge requires the register of the controller
     * @param serial_number unique id
     */
    public void register(String serial_number, String XMLFile) throws Exception;

}
