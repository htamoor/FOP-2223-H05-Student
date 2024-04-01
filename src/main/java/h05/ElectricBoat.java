package h05;

import java.util.function.IntSupplier;

public class ElectricBoat extends MeansOfTransport implements ElectricallyDriven, IntSupplier {
    private byte specificType;
    private int currentCharge;
    private int capacity;

    public ElectricBoat(byte specificType, int currentCharge, int capacity) {
        setSpecificType(specificType);
        transportType = TransportType.VESSEL;

        this.capacity = Math.max(0, capacity);
        this.currentCharge = Math.min(this.capacity, Math.max(0, currentCharge));
    }


    public byte getSpecificType() {
        return specificType;
    }

    public int getCurrentCharge() {
        return currentCharge;
    }

    public int getCapacity() {
        return capacity;
    }

    public void letsGo(byte additionalChargeVolume, int distance) {
        int check = additionalChargeVolume + currentCharge;
        if (check < capacity) {
            currentCharge += additionalChargeVolume;
        }
        letMeMove(distance);
    }



    public int letMeMove(int distance) {
        int reduceBy = 0;
        if (0 < currentCharge && currentCharge < distance / 100) {
            reduceBy = currentCharge - 1;
        }
        return reduceBy;
    }

    public boolean ElectricallyDriven() {
        return false;
    }

    public boolean highVoltageChargeable() {
        return specificType % 2 == 0 && specificType + 1 % 3 == 0;
    }

    public boolean standardVoltageChargeable() {
        return specificType == 6 || specificType == 11 || specificType == 12 || specificType 				== 22;
    }

    @Override
    public int getAsInt() {
        return capacity - currentCharge;
    }

    public byte setSpecificType(byte specificType) {
        byte oldSpecificType = this.specificType;
        this.specificType = (byte) Math.max(0, Math.min(30, specificType));
        return oldSpecificType;
    }

}
