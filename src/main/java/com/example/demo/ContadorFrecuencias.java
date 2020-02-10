
package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;

public class ContadorFrecuencias {
    public String Count(String parrafo) {
        FrecuenciaLetra[] freq = new FrecuenciaLetra[1];
        int ip1, ip2, iFrec;
        char string[] = parrafo.toCharArray();
        iFrec = 0;

        //itera sobre el parrafo
        for(ip1 = 0; ip1 <parrafo.length(); ip1++) {
            char letra = string[ip1];
            //verifica si no es un espacioo
            if((letra == ' ') == false){
                //creamos nuevo caracter
                freq[iFrec] = new FrecuenciaLetra(letra);
                freq = resizeList(1,freq);
                //itera sobre el resto del parrafo para encontrar los mismos caracteres
                for (ip2 = ip1 + 1; ip2 < parrafo.length(); ip2++) {
                    //verifica si no es un espacio
                    if (letra == string[ip2]) {
                        //incrementa la frecuencia y la vuelve un espacio para ser obviada
                        freq[iFrec].incrementar();
                        string[ip2] = ' ';
                    }
                }
                iFrec++;
            }
        }
        //ordenamos array
        Arrays.sort(freq,0,iFrec-1);
        //Armar el string a devolver
        String histograma = "";
        //aseguramos que el tope sea de 10
        int top = freq.length;
        if (top>10) {
            top = 10;
        }
        for(iFrec = 0; iFrec <top; iFrec++) {

            if(freq[iFrec] != null && freq[iFrec].getCaracter() != ' ')
                histograma = histograma.concat(freq[iFrec].getCaracter() + "-" + freq[iFrec].getFrecuencia()+ " " + repeatString("*", freq[iFrec].getFrecuencia())+"\n");
        }
        return histograma;
    }

    private String repeatString(String str,int count){
        String  r = "";
        for (int i = 0; i < count; i++) {
            r += str;
        }
        return r;
    }
    private FrecuenciaLetra[] resizeList(int extraSpace, FrecuenciaLetra[] lista){
        /*Resizes de size of the array
         * it creates a bigger array and copy the data there
         * then it changes the old array*/
        int size;
        size = lista.length + extraSpace;//makes the new size percentage bigger
        FrecuenciaLetra listaTem[] = new FrecuenciaLetra[size];
        System.arraycopy(lista, 0, listaTem, 0, lista.length);
        return listaTem;
    }
}
