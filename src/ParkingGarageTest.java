import junit.framework.TestCase;

public class ParkingGarageTest extends TestCase {


    ///Test: 1
    ///Objective: Enter valid entry from 1-24
    ///Input: 3.00
    ///Expected Output: 2.00

    public void testParkingCost001(){
        ParkingGarage testObj = new ParkingGarage();
        assertEquals(2.00, testObj.ParkingCost(3.00));
    }

    ///Test: 2
    ///Objective: Enter valid non whole-number entry from 1-24
    ///Input: 3.25
    ///Expected Output: 2.00

    public void testParkingCost002(){
        ParkingGarage testObj = new ParkingGarage();
        assertEquals(2.00, testObj.ParkingCost(3.25));
    }

    ///Test: 3
    ///Objective: Enter invalid entry outside the expected range
    ///Input: 25.00
    ///Expected Output: -99

    public void testParkingCost003(){
        ParkingGarage testObj = new ParkingGarage();
        assertEquals(-99, testObj.ParkingCost(25.00));
    }

    ///Test: 4
    ///Objective: Enter valid entry above 3 hours to ensure additional hour cost of .50c is applied
    ///Input: 4.00
    ///Expected Output: 2.50

    public void testParkingCost004(){
        ParkingGarage testObj = new ParkingGarage();
        assertEquals(2.50, testObj.ParkingCost(4.00));
    }

    ///Test: 5
    ///Objective: Enter expected valid entry of 24 or below to ensure maximum cost does not exceed 10.00
    ///Input: 24.00
    ///Expected Output: 10.00

    public void testParkingCost005(){
        ParkingGarage testObj = new ParkingGarage();
        assertEquals(10.00, testObj.ParkingCost(24.00));
    }
}