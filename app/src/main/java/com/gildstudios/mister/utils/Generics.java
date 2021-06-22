package com.gildstudios.mister.utils;

public class Generics {

    private Generics() {

    }

    public static String capitalize(String s) {
        return s.substring(0, 1)
                .toUpperCase() + s.substring(1);
    }

}
