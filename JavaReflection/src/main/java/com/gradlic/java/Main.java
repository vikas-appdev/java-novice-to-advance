package com.gradlic.java;

public class Main {
    public static void main(String[] args) {
        Employee jack = new Employee();

        System.out.println("Employee jack: "+jack);

        Employee jessica = new Employee("Jessica", "VP", 1600000);

        System.out.println("Employee jessica: "+jessica);
    }
}
