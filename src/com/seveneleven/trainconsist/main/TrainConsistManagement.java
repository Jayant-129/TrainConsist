package com.seveneleven.trainconsist.main;

import java.util.ArrayList;
import java.util.List;

/*
 * =====================================================
 * MAIN CLASS - TrainConsistManagement
 * =====================================================
 *
 * UC1: Initialize Train and Display Consist Summary
 *
 * Description:
 * Entry point of the Train Consist Management Application.
 *
 * The program:
 * - Initializes an empty train consist
 * - Uses ArrayList to store bogies
 * - Displays initial bogie count
 * - Prints current train state
 */

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("====================================================");
        System.out.println("        === Train Consist Management App ===");
        System.out.println("====================================================\n");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        System.out.println("\nCurrent Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nProgram running...");
    }
}