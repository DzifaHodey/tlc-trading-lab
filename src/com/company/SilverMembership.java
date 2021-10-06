package com.company;

public class SilverMembership extends MembershipType{
    public SilverMembership() {
        super(10);

    }

    @Override
    public String getMembershipType() {
        return "Silver";
    }
}
