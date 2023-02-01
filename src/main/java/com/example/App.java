package com.example;

public class App {
    public static String notaTexto(int notaNumero) throws IllegalArgumentException{
        if (1>notaNumero || notaNumero >10){
            throw new IllegalArgumentException();
        }else if (notaNumero<5){
            return "suspenso";
        }else if (notaNumero < 7){
            return "aprobado";
        }else if (notaNumero < 8){
            return "notable";
        }else if (notaNumero<10){
            return "excelente";
        }else{
            return "sobresaliente";
        }
    }
}

