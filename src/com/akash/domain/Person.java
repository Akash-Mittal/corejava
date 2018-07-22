package com.akash.domain;

public class Person {
    public int i;

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString() {
        return this.i + "";
    }
}