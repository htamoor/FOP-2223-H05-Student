package h05;

public class FuelDrivenVehicle extends MeansOfTransport implements FuelDriven {
    private FuelType fuelType;
    private int fillingLevel;

    public FuelDrivenVehicle(FuelType fuelType, TransportType transportType, int fillingLevel) {
        this.fuelType = fuelType;
        this.transportType = transportType;
        this.fillingLevel = fillingLevel;
    }

    public int getFillingLevel() {
        return fillingLevel;
    }

    public void fillUp(int fillValue) {
        if (fillValue > 0) {
            fillingLevel += fillValue;
        }
    }

    public int letMeMove(int distance) {
        int reduceBy;
        if (distance < 0) {
            reduceBy = 0;
        } else if (distance < 10 * fillingLevel) {
            reduceBy = distance / 10;
        } else {
            reduceBy = fillingLevel;
        }
        fillingLevel -= reduceBy;
        return reduceBy * 10;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public double getAverageConsumption(double speed) {
        if (speed < 0) {
            return 0;
        } else if (200 < speed) {
            return 20;
        } else {
            return 0.1 * speed;
        }
    }
}
