package com.example.alunos.imc;

/**
 * Created by Alunos on 31/03/2017.
 */

public class Imc {

    private int peso;
    private double altura;

    public Imc(int peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularValor(){
        return peso / (altura * altura);
    }

    public String calcularCategoria(){
        double imc = calcularValor();
        if (imc < 25){
            return "NORMAL";
        } else if (imc >= 25 && imc < 30){
            return "SOBREPESO";
        } else {
            return "OBESO";
        }
    }
}
