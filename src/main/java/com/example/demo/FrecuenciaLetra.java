package com.example.demo;

public class FrecuenciaLetra implements Comparable<FrecuenciaLetra>{
    int frecuencia;
    char caracter;
    public FrecuenciaLetra(char caracter){
        frecuencia = 1;
        this.caracter = caracter;
    }
    public void incrementar(){
        frecuencia++;
    }
    public char getCaracter(){
        return caracter;
    }
    public int getFrecuencia(){
        return frecuencia;
    }

    public int compareTo(FrecuenciaLetra comparefreqL) {

        int comparefreq = ((FrecuenciaLetra) comparefreqL).getFrecuencia();

        return comparefreq - this.frecuencia;

    }
}
