package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterfazAPITest {

    @org.junit.jupiter.api.Test
    void getFrecuencia() {
        InterfazAPI interfaz = new InterfazAPI();
        String a = interfaz.getFrecuencia("qweqwe");
        assertEquals("q-2 **\nw-2 **\ne-2 **\n", a);
        a = interfaz.getFrecuencia("q");
        assertEquals("q-1 *\n", a);
    }

    @org.junit.jupiter.api.Test
    void getPalindromas() {
        InterfazAPI interfaz = new InterfazAPI();
        String a = interfaz.getPalindromas("alvla, alvla, taka");
        assertEquals("taka ", a);
    }
}