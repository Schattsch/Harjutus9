package com.karel.program;

public class Main {
    public static void main(String[] args) {
        VehicleRegister register = new VehicleRegister();

        RegistrationPlate reg1 = new RegistrationPlate("AAA-123", "EST");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");

        System.out.println("Adding owners to the register:");
        System.out.println("Added: " + register.add(reg1, "Karel"));
        System.out.println("Added: " + register.add(reg1, "Karl")); //false!!
        
        System.out.println("\nRetrieving owners from the register:");
        System.out.println("Owner of " + reg1 + ": " + register.get(reg1));
        System.out.println("Owner of " + reg2 + ": " + register.get(reg2)); //null!!

        System.out.println("\nDeleting entries from the register:");
        System.out.println("Deleted: " + register.delete(reg1));
        System.out.println("Deleted: " + register.delete(reg2)); //false!!

        System.out.println("\nRetrieving owner after deletion:");
        System.out.println("Owner of " + reg1 + ": " + register.get(reg1));
    }
}
