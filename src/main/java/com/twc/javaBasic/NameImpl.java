package com.twc.javaBasic;

public class NameImpl implements WithName, Person {
    @Override
    public String getName() {
        //  Please implement the method to pass the test.
        //
        // <--start
        return Person.super.getName();
        // --end-->
    }
}
