package transport;

import serviceStation.*;
import mechanic.*;
import sponsor.*;
import transport.*;
import driver.*;
public enum BodyType {
    SEDAN ("Седан"),
    HATCHBACK ("Хетчбэк"),
    COUPE ("Купе"),
    STATION_WAGON ("Универсал"),
    SUV ("Внедорожник"),
    CROSSOVER ("Кроссовер"),
    PICKUP ("Пикап"),
    VAN ("Фургон"),
    MINIVAN ("Минивэн");

    private final String bodyType;
    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return "Тип кузова - " + this.bodyType;

    }
}