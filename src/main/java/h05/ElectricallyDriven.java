package h05;

public interface ElectricallyDriven {
    /**
     * @return true, if the Vehicle can be charged with Standard Voltage Level
     */
    public boolean standardVoltageChargeable();
    /**
     * @return true, if the Vehicle can be charged with High Voltage Level
     */
    public boolean highVoltageChargeable();

    /**
     * Let the vehicle move a predefined distance
     *
     * @param additionalChargeVolume defines an additional Charge Volume
     * @param distance               to move
     */
    void letsGo(byte additionalChargeVolume, int distance);
}
