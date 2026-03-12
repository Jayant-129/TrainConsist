/*
 * =============================================================
 * Project       : Train Consist Management App
 * Package       : com.seveneleven.trainconsist.main
 * Class Name    : UseCaseTwelveTrainConsistMgmt
 *
 * Use Case      : UC Twelve - Safety Compliance Check
 *
 * Description   :
 * This program validates whether all goods bogies follow
 * safety rules using the Java Stream API.
 *
 * Business Rule:
 * Cylindrical bogies are allowed to carry only Petroleum.
 *
 * The application:
 * 1. Creates a list of goods bogies.
 * 2. Converts the list into a stream.
 * 3. Applies safety validation using allMatch().
 * 4. Checks cargo compatibility with bogie shape.
 * 5. Displays whether the train formation is safe.
 *
 * Concepts Demonstrated:
 * - Java Stream API
 * - allMatch()
 * - Lambda expressions
 * - Business rule validation
 *
 * Author        : Developer
 * Version       : 12.0
 * =============================================================
 */

package com.seveneleven.trainconsist.main;

import java.util.ArrayList;
import java.util.List;

public class UseCaseTwelveTrainConsistMgmt {

    static class GoodsBogie {

        String shape;
        String cargo;

        public GoodsBogie(String shape, String cargo) {
            this.shape = shape;
            this.cargo = cargo;
        }

        public String toString() {
            return shape + " Bogie carrying " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================================");
        System.out.println("      === Train Consist Management App ===");
        System.out.println("====================================================\n");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        System.out.println("Goods Bogies:\n");

        for (GoodsBogie g : goodsBogies) {
            System.out.println(g);
        }

        boolean isSafe =
                goodsBogies.stream()
                        .allMatch(b ->
                                !b.shape.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum"));

        if (isSafe) {
            System.out.println("\nSafety Check Result: Train formation is SAFE.");
        } else {
            System.out.println("\nSafety Check Result: Train formation is NOT SAFE.");
        }
    }
}