package com.company;

public class BronzeMembership extends MembershipType{

    public BronzeMembership() {
        super(5);
    }


    @Override
    public String getMembershipType() {
        return "Bronze";
    }
}
