package olympiad_v1.task_3;

/**
 * THIS IS A READY CLASS
 */
public class ParkingSpot {
    private final int spotNumber;
    private final int spotSize;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotNumber, int spotSize) {
        this.spotNumber = spotNumber;
        this.spotSize = spotSize;
        this.parkedVehicle = null;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public int getSpotSize() {
        return spotSize;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }
}
