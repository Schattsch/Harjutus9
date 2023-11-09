package com.karel.program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        Set<String> uniqueOwners = new HashSet<>();
        for (String owner : owners.values()) {
            uniqueOwners.add(owner);
        }
        System.out.println("Car Owners:");
        for (String owner : uniqueOwners) {
            System.out.println(owner);
        }
    }
}
