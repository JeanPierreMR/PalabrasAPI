package com.example.demo;

public class VerificadorPalindromas {
    public String verificarPalindromas(String palabras)
    {
        palabras = palabras.replaceAll("\n", " ");
        String[] listaPalabras = palabras.split(", ");
        String[] noPalindromas = new String[listaPalabras.length];
        int numNoPalindromas = 0;
        String original, inversa ;

        //se itera sobre la lista de palabras
        for(int x = 0; x < listaPalabras.length; x++ ){
            original = listaPalabras[x];
            inversa = invertir(original);
            //se verifica que sea la misma y se guarda si no
            if (original.equals(inversa) == false){
                noPalindromas[numNoPalindromas] = original;
                numNoPalindromas++;
            }
        }

        return listToString(noPalindromas);
    }


    private String invertir(String palabra){
        String inversa = "";
        for ( int i = palabra.length() - 1; i >= 0; i-- ) {
            inversa = inversa + palabra.charAt(i);
        }
        return inversa;
    }


    private String listToString(String[] lista){
        String str ="";
        for(int x = 0; x < lista.length; x++ ) {
            if(lista[x]!= null)
                str = str.concat(lista[x]+" ");
        }
        return str;
    }


    private void resizeList(int extraSpace, String[] lista){
        /*Resizes de size of the array
         * it creates a bigger array and copy the data there
         * then it changes the old array*/
        int size;
        size = lista.length + extraSpace;//makes the new size percentage bigger
        String listaTem[] = new String[size];
        System.arraycopy(lista, 0, listaTem, 0, lista.length);
        lista = listaTem;
    }
}
