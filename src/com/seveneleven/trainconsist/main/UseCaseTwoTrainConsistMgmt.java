package com.seveneleven.trainconsist.main;

import java.util.ArrayList;
import java.util.List;

/*
 * =====================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * =====================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * Demonstrates ArrayList CRUD operations.
 *
 * Operations performed:
 * - Add passenger bogies
 * - Display bogies
 * - Remove a bogie
 * - Check existence using contains()
 *
 * Concepts:
 * ArrayList
 * add()
 * remove()
 * contains()
 * dynamic collections
 *
 * @author Developer
 * @version 2.0
 */

public class UseCaseTwoTrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================================");
        System.out.println("      === Train Consist Management App ===");
        System.out.println("====================================================\n");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies After Addition:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing AC Chair:");
        System.out.println(passengerBogies);

        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper exist? : " + exists);

        System.out.println("\nFinal Bogie List:");
        System.out.println(passengerBogies);
    }
}