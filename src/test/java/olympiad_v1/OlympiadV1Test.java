package olympiad_v1;

import olympiad_v1.task_3.ParkingLot;
import olympiad_v1.task_3.ParkingSpot;
import olympiad_v1.task_3.Vehicle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * Created by: Demyd Titenko
 * <p>
 * Date: 26.11.2026
 * <p>
 * Time: 22:17
 * <p>
 * Project name: olympiad-v1
 */
class OlympiadV1Test {

    @Test
    @DisplayName("Reverse number")
    void testTask1_ReverseNumber() {
        assertEquals(1133, Task1.reverseNumber(3311));
        assertEquals(123456789, Task1.reverseNumber(987654321));
        assertEquals(0, Task1.reverseNumber(0));
        assertEquals(1, Task1.reverseNumber(1000));
        assertEquals(-85, Task1.reverseNumber(-580));
    }

    @Test
    @DisplayName("Find missing number")
    void testTask2_FindMissingNumber() {
        assertEquals(2, Task2.findMissingNumber(new int[]{3, 1, 4, 5}));
        assertEquals(1, Task2.findMissingNumber(new int[]{2, 3}));
        assertEquals(4, Task2.findMissingNumber(new int[]{1, 2, 3}));
        assertEquals(3, Task2.findMissingNumber(new int[]{1, 2, 4, 5}));
        assertEquals(4, Task2.findMissingNumber(new int[]{1, 2, 3, 5}));
    }
    @Test
    @DisplayName("Task 3: Parking lot optimal placement")
    void testTask3_ParkingLotOptimalPlacement() {
        ParkingSpot largeSpot = new ParkingSpot(1, 3);
        ParkingSpot smallSpot = new ParkingSpot(2, 1);
        ParkingSpot mediumSpot = new ParkingSpot(3, 2);
        ParkingLot lot = new ParkingLot(new ParkingSpot[]{largeSpot, smallSpot, mediumSpot});

        assertTrue(lot.parkVehicle(new Vehicle("AA1111AA", 1)));
        assertEquals(0, lot.getAvailableSpotsCount(1));
        assertEquals(1, lot.getAvailableSpotsCount(3));
        assertNotNull(smallSpot.getParkedVehicle());

        assertTrue(lot.parkVehicle(new Vehicle("BB2222BB", 2)));
        assertEquals(0, lot.getAvailableSpotsCount(2));

        assertTrue(lot.parkVehicle(new Vehicle("CC3333CC", 3)));
        assertEquals(0, lot.getAvailableSpotsCount(3));

        assertFalse(lot.parkVehicle(new Vehicle("DD4444DD", 1)));

        assertTrue(lot.leaveSpot(2));
        assertFalse(lot.leaveSpot(2));
        assertFalse(lot.leaveSpot(99));
        assertEquals(1, lot.getAvailableSpotsCount(1));
    }
}