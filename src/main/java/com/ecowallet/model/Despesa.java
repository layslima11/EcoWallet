package com.ecowallet.model;

import java.time.LocalDate;

public class Despesa extends Transacao {

    public Despesa (String despesa,
                    double valor,
                    LocalDate data,
                    Categoria categoria) {

        super(despesa, valor, data, categoria);
    }

    @Override
    public double getValorParaSaldo() {
        return getValor() * -1;
    }
}