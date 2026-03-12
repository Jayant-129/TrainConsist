/*
 * =============================================================
 * Project       : Train Consist Management App
 * Package       : com.seveneleven.trainconsist.main
 * Class Name    : UseCaseFourteenTrainConsistMgmt
 *
 * Use Case      : UC Fourteen - Handle Invalid Bogie Capacity
 *
 * Description   :
 * This program demonstrates how to prevent invalid bogies
 * from being created using a custom exception.
 *
 * Rule:
 * A passenger bogie must have capacity greater than 0.
 *
 * If capacity <= 0, an InvalidCapacityException is thrown.
 *
 * Concepts Demonstrated:
 * - Custom Exception
 * - Exception inheritance
 * - throw keyword
 * - throws declaration
 * - Fail-fast validation
 *
 * Author        : Developer
 * Version       : 14.0
 * =============================================================
 */

package com.seveneleven.trainconsist.main;

public class UseCaseFourteenTrainConsistMgmt {

    static class InvalidCapacityException extends Exception {

        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class Bogie {

        String name;
        int capacity;

        public Bogie(String name, int capacity) throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException("Invalid capacity for bogie: " + name);
            }

            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " - Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================================");
        System.out.println("      === Train Consist Management App ===");
        System.out.println("====================================================\n");

        try {

            Bogie b1 = new Bogie("Sleeper", 72);
            Bogie b2 = new Bogie("AC Chair", 56);
            Bogie b3 = new Bogie("Invalid Coach", -10);

            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);

        }
        catch (InvalidCapacityException e) {

            System.out.println("Exception Occurred: " + e.getMessage());

        }

        System.out.println("\nProgram continues safely...");
    }
}