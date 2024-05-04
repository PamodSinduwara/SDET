package com.sdet.assignments.four.question_5;
public class RethrowException {
    public static void main(String[] args) {
        try {
            anyMethod();
        } catch (Exception e) {
            System.out.println("Exception caught in main method:");
            e.printStackTrace();
        }
    }

    static void anyMethod() throws Exception {
        try {
            anotherMethod();
        } catch (Exception e) {
            System.out.println("Exception caught in anyMethod:");
            throw e;
        }
    }

    static void anotherMethod() throws Exception {
        throw new Exception("Exception thrown from anotherMethod");
    }
}
