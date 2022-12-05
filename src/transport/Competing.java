package transport;
import serviceStation.*;
import mechanic.*;
import sponsor.*;
import transport.*;
import driver.*;

public interface Competing {
    void pitStop();
    int getBestLapTime();
    int getMaxSpeed();
}