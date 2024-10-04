package day4.collections.set.hashset;

import java.util.HashSet;

public class LoyaltyProgram {

    public static void main(String[] args) {

        // HashSet to store the membership ID's

        HashSet<String> memberIDs = new HashSet<>();

        memberIDs.add("MEM1");
        memberIDs.add("MEM2");
        memberIDs.add("MEM3");
        memberIDs.add("MEM4");
        memberIDs.add("MEM5");
        memberIDs.add("MEM5");


        checkMembershipAndApplyDiscount(memberIDs, "MEM2");// Existing Member
        checkMembershipAndApplyDiscount(memberIDs, "MEM7");// Non- Member
        checkMembershipAndApplyDiscount(memberIDs, "MEM3");// Existing Member
        checkMembershipAndApplyDiscount(memberIDs, "MEM77");// Non- Member
    }


    private static void checkMembershipAndApplyDiscount(HashSet<String> memberIDs, String customerId) {

        if(memberIDs.contains(customerId)) {
            System.out.println("Customer "+ customerId+ " is a member. Applying discount");
        } else {
            System.out.println("Customer "+ customerId+ " is not a member. No discount");

        }

    }
}
