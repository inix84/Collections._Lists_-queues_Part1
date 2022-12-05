package driver;
import serviceStation.*;
import mechanic.*;
import sponsor.*;
import transport.*;
import driver.*;

public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, int drivingExperience, Bus bus) {
        super(fullName, "D", drivingExperience, bus);
    }
}