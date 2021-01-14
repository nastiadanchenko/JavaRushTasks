package com.javarush.task.task38.task3804;



public class FactoryException {
    public static Throwable getFactoryException(Enum except) {
        if (except == null) return new IllegalArgumentException();
        String massage = except.name().charAt(0) + except.name().substring(1).
                toLowerCase().replace("_", " ");
        if (except instanceof ApplicationExceptionMessage) return new Exception(massage);
        if (except instanceof DatabaseExceptionMessage) return new RuntimeException(massage);
        if (except instanceof UserExceptionMessage) return new Error(massage);
        return new IllegalArgumentException();
    }
}
