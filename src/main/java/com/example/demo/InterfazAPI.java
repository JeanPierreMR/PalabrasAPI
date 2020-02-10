package com.example.demo;


import com.google.gson.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterfazAPI {
    InterfazAPI(){

    }
    @PostMapping("/Frecuencia")
    public String getFrecuencia(String parrafo){
        ContadorFrecuencias contador = new ContadorFrecuencias();
        return contador.Count(parrafo);
    }

    @PostMapping("/Palindromas")
    public String getPalindromas(String csvList){
        VerificadorPalindromas verificador = new VerificadorPalindromas();
        return verificador.verificarPalindromas(csvList);
    }

<<<<<<< HEAD
=======
    @GetMapping("/MontoDebitoMayor")
    public double debitoMayor(){
        return transaccionManager.getDebitoMayor();
    }

    @GetMapping("/NumeroDeOperaciones")
    public double numeroOperaciones(){
        return transaccionManager.getNum_transacciones();
    }

    @GetMapping("/Arreglo")
    public String arreglo(){
        return transaccionManager.getArreglos();
    }


>>>>>>> parent of a1cb218... updated JMeter Test + Fixed some issues

}
