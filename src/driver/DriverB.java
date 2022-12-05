package driver;
import serviceStation.*;
import mechanic.*;
import sponsor.*;
import transport.*;
import driver.*;

public class DriverB extends Driver<Car> {

    public DriverB(String fullName, int drivingExperience, Car car) {
        super(fullName, "B", drivingExperience, car);
    }
}