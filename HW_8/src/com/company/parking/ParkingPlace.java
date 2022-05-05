package com.company.parking;

import java.sql.Time;

public class ParkingPlace {
    /** Парковочное место, на которое зарегестрирована машина, баланс, и оставшееся время для парковки*/
    int placeNumber;
    Car car;
    double balance;
    Time time; // Не знаю какой класс используется для времени, но что первое попалось, то и поставил :)
}
