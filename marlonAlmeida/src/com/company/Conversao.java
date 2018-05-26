package com.company;

public class Conversao {
    public static void main(String[] args){}

    public static float conversaoTemperatura(float x){
        float result = x+273;
        return result;
    }

    public static float conversaoVelocidade(float x){
        float result = (float) (x * 0.6214);
        return result;
    }

    public static float conversaoDistancia(float x){
        float result = x * 100000;
        return result;
    }

    public static float conversaoTempo(float x){
        float result = x * 3600;
        return result;
    }
}
