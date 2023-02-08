package com.treinamento;

public enum CorSemaforo {

    VERDE(1000), AMARELO(1000), VERMELHO(2000);

    private int tempoEspera;

    CorSemaforo(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
    
}