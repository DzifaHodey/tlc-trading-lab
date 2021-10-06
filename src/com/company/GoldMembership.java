package com.company;

public class GoldMembership extends MembershipType{
    public GoldMembership() {
        super(20);
    }

    @Override
    public String getMembershipType() {
        return "Gold";
    }
}
