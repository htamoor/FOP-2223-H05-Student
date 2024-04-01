package h05;

public interface FuelDriven {

    /**
     * @return the FuelType of the Vehicle
     */
    public FuelType getFuelType();
    /**
     * @param speed current speed of vehicle
     * @return the Average Consumption depending on the current speed
     */
    public double getAverageConsumption(double speed);
}
