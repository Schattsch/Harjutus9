package com.karel.program;

public class Main {
    public static void main(String[] args) {
        VehicleRegister register = new VehicleRegister();

        RegistrationPlate reg1 = new RegistrationPlate("AAA-123", "EST");
        RegistrationPlate reg2 = new RegistrationPlate("UUU-666", "FI");
        RegistrationPlate reg3 = new RegistrationPlate("ABC-321", "EST");

        System.out.println("Adding owners to the register:");
        System.out.println("Added: " + register.add(reg1, "Karel"));
        System.out.println("Added: " + register.add(reg2, "Karl"));
        System.out.println("Added: " + register.add(reg3, "Karel"));
        
        
        System.out.println("\nAll Registration Plates:");
        register.printRegistrationPlates();

        System.out.println();
        register.printOwners();
    }
}
