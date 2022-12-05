package driver;
import serviceStation.*;
import mechanic.*;
import sponsor.*;
import transport.*;
import driver.*;

public class DriverC extends Driver<Truck> {
    public DriverC(String fullName, int drivingExperience, Truck truck) {
        super(fullName, "C", drivingExperience, truck);
    }
}