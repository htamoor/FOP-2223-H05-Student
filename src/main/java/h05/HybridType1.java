package h05;

public class HybridType1 implements FuelDriven, ElectricallyDriven {
    private static FuelType fuelType;
    private static double averageConsumption;
    private static boolean standardVoltageChargeable;
    private static boolean highVoltageChargeable;

    public FuelType getFuelType() {
        return fuelType;
    }

    public double getAverageConsumption(double speed) {
        return averageConsumption;
    }

    public boolean highVoltageChargeable() {
        return highVoltageChargeable;
    }

    @Override
    public void letsGo(byte additionalChargeVolume, int distance) {

    }

    public boolean standardVoltageChargeable() {
        return standardVoltageChargeable;
    }

    public void setFuelType(FuelType fuelType) {
        HybridType1.fuelType = fuelType;
    }

    public void setAverageConsumption(double averageConsumption) {
        HybridType1.averageConsumption = averageConsumption;
    }

    public void toggleStandardVoltageChargeable() {
        standardVoltageChargeable = !standardVoltageChargeable;
    }

    public void toggleHighVoltageChargeable() {
        highVoltageChargeable = !highVoltageChargeable;
    }
}
