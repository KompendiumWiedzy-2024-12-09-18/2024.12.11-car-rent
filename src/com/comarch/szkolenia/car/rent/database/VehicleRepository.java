package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Bus;
import com.comarch.szkolenia.car.rent.model.Car;
import com.comarch.szkolenia.car.rent.model.Motorcycle;
import com.comarch.szkolenia.car.rent.model.Vehicle;

public class VehicleRepository {
    private final Vehicle[] vehicles = new Vehicle[9];

    public VehicleRepository() {
        vehicles[0] = new Car("BMW", "3", 2020, 300.0, "KR11");
        vehicles[1] = new Car("Honda", "Civic", 2022, 250.0, "KR22");
        vehicles[2] = new Car("Toyota", "Corolla", 2090, 150.0, "KR33");
        vehicles[3] = new Car("Kia", "Ceed", 2020, 200.0, "KR44");
        vehicles[4] = new Car("Fiat", "Multipla", 2005, 50.0, "KR55");
        vehicles[5] = new Bus("Solaris", "1000", 2001, 800.0, "KR666", 50);
        vehicles[6] = new Bus("Solaris", "2000", 2015, 1000.0, "KR777", 58);
        vehicles[7] = new Bus("Mercedes", "Jakis", 2020, 1200.0, "KR888", 62);
        vehicles[8] = new Motorcycle("Honda", "R1000", 2015, 400.0, "KR9999", false);
    }

    public boolean rent(String plate) {
        for(Vehicle vehicle : this.vehicles) {
            if(vehicle.getPlate().equals(plate) && !vehicle.isRent()) {
                vehicle.setRent(true);
                return true;
            }
        }

        return false;
    }

    public Vehicle[] getVehicles() {
        return this.vehicles;
    }
}
